package com.example.demo.controller;

import com.example.demo.service.ProductService;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService ps;

    @PostMapping("/create")
    public Product saveProduct(@RequestBody Product pdt){
          Product pc = ps.save(pdt);
          return  pc;
    }
    @PutMapping("/updade")
    public Product updateProduct(@RequestBody Product pdt){
        Product pc = ps.update(pdt);
        return pc;
    }
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id){
        Product getReponse = ps.findById(id);
        return getReponse;
    }
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestBody Product pdt) {
        ps.delete(pdt);
        return "Record deleted succesfully";
    }
    @GetMapping("/all")
    public List<Product> findAllProduct(){
        List<Product> pdts = ps.findAll();
        return pdts;
    }
}
