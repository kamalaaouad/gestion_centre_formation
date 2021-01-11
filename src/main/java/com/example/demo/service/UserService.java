package com.example.demo.service;

import com.example.demo.dao.IUserRepository;
import com.example.demo.model.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService<users>{
    @Autowired
    IUserRepository iur;
    @Override
    public users save(users u) {
        return iur.save(u);
    }

    @Override
    public void delete(users u) {
        iur.delete(u);
    }

    @Override
    public users update(users u) {
        return iur.save(u);
    }

    @Override
    public users findById(int i) {
        Optional<users> us = iur.findById(i);
        users usr = us.get();
        return usr;
    }

    @Override
    public List<users> findAll() {
        List<users> userss = iur.findAll();
        return userss;
    }

    public users verifiedUserIsExiste(users u){
        users us = iur.findUserByEmail(u.getEmail());
        return us;
    }
}
