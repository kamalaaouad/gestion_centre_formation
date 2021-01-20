package com.example.demo.service;

import com.example.demo.dao.IFormationRepository;
import com.example.demo.model.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormationService implements IFormationService<Formation>{
    @Autowired
    IFormationRepository iFormationRepository =null;
    @Override
    public Formation save(Formation p) {
        return iFormationRepository.save(p);
    }

    @Override
    public void delete(Formation p) {
         iFormationRepository.delete(p);
    }

    @Override
    public Formation update(Formation p) {
        return iFormationRepository.save(p);
    }

    @Override
    public Formation findById(int i) {
        Optional<Formation> formation = iFormationRepository.findById(i);
        Formation f = formation.get();
        return f;
    }

    @Override
    public List<Formation> findAll() {
        List<Formation> listFormation = iFormationRepository.findAll();
        return listFormation;
    }
}
