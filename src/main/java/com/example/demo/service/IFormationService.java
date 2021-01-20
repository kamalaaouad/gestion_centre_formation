package com.example.demo.service;

import java.util.List;

public interface IFormationService<F> {
    F save(F p);
    void delete(F p);
    F update(F p);
    F findById(int i);
    List<F> findAll();
}
