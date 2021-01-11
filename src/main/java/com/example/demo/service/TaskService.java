package com.example.demo.service;

import com.example.demo.dao.ITaskRepository;
import com.example.demo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService implements ITaskService<Task>{
    @Autowired
    private ITaskRepository taskRepository;
    @Override
    public Task save(Task p) {
        Task createTask = taskRepository.save(p);
        return createTask;
    }

    @Override
    public void delete(Task p) {
        taskRepository.delete(p);
    }

    @Override
    public Task update(Task p) {
        Task updatetask = taskRepository.save(p);
        return updatetask;
    }

    @Override
    public Task findById(int i) {
        Optional<Task> findtask = taskRepository.findById(i);
        Task task = findtask.get();
        return task;
    }

    @Override
    public List<Task> findAll() {
        List<Task>  tasks = taskRepository.findAll();
        return tasks;
    }
}
