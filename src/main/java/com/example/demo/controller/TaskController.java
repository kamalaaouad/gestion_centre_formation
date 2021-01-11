package com.example.demo.controller;

import com.example.demo.dao.ITaskRepository;
import com.example.demo.model.Product;
import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("task")
@CrossOrigin(origins = "*")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @Autowired
    private ITaskRepository taskRepository;

    @PostMapping("/create")
    public Task saveTask(@RequestBody Task task){
        Task tsk = taskService.save(task);
        return  tsk;
    }
    @PutMapping("/update")
    public Task updateProduct(@RequestBody Task task){
        //Task tsk = taskService.update(task);
        //return tsk;

        return taskRepository.save(task);
    }

    @GetMapping("/{id}")
    public Task getProduct(@PathVariable int id){
        Task getReponse = taskService.findById(id);
        return getReponse;
    }
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestBody Task task) {
        taskService.delete(task);
        return "Record deleted succesfully";
    }
    @GetMapping("/all")
    public List<Task> findAllProduct(){
        List<Task> pdts = taskService.findAll();
        return pdts;
    }
}
