package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface ITaskService<T> {
    T save(T p);
    void delete(T p);
    T update(T p);
    T findById(int i);
    List<T> findAll();
}
