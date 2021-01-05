package com.example.demo.service;

import com.example.demo.dao.ProductRepository;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository pr;
    @Override
    public Product save(Product p) {
        Product createproduct = pr.save(p);
        return createproduct;
    }

    @Override
    public void delete(Product p) {
        pr.delete(p);
    }

    @Override
    public Product update(Product p) {
        Product updateproduct = pr.save(p);
        return updateproduct;
    }

    @Override
    public Product findById(int i) {
        Optional<Product> product = pr.findById(i);
        Product pdct = product.get();
        return pdct;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = pr.findAll();
        return products;
    }
}
