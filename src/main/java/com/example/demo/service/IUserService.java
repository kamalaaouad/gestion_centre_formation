package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.users;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IUserService<T> {
    public T save(T u);
    public void delete(T u);
    public T update(T u);
    public T findById(int i);
    public List<T> findAll();
}
