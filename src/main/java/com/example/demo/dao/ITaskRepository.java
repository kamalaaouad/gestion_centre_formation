package com.example.demo.dao;

import com.example.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepository extends JpaRepository<Task , Integer> {
}
