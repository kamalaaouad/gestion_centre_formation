package com.example.demo.dao;

import com.example.demo.model.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFormationRepository extends JpaRepository<Formation,Integer> {
}
