package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.model.users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    UserService us;
    @PostMapping("/create")
    public users saveTask(@RequestBody users user){
        users user1 = us.save(user);
        return  user1;
    }
    @PostMapping("/verified")
    public users verifiedUser(@RequestBody users user){
        users user1 = us.verifiedUserIsExiste(user);
        System.out.println(user1);
        return  user1;
    }
    @PutMapping("/update")
    public users updateProduct(@RequestBody users usr){
        //Task tsk = taskService.update(task);
        //return tsk;

        return us.save(usr);
    }

    @GetMapping("/{id}")
    public users getProduct(@PathVariable int id){
        users getReponse = us.findById(id);
        return getReponse;
    }
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestBody users usr) {
        us.delete(usr);
        return "Record deleted succesfully";
    }
    @GetMapping("/all")
    public List<users> findAllProduct(){
        List<users> userss = us.findAll();
        return userss;
    }
}
