package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {
    public Product save(Product p);
    public void delete(Product p);
    public Product update(Product p);
    public Product findById(int i);
    public List<Product> findAll();
}
