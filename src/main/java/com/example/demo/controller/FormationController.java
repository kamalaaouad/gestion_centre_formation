package com.example.demo.controller;

import com.example.demo.model.Formation;
import com.example.demo.model.users;
import com.example.demo.service.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formation")
@CrossOrigin( origins = "*")
public class FormationController {
    @Autowired
    FormationService fs = null ;
    @PostMapping("/create")
    public Formation saveFormation(@RequestBody Formation formation){
        Formation  f = fs.save(formation);
        return f;
    }

    @PutMapping("/update")
    public Formation updateProduct(@RequestBody Formation formation){
        return fs.save(formation);
    }

    @GetMapping("/{id}")
    public Formation getProduct(@PathVariable int id){
        Formation getReponse = fs.findById(id);
        return getReponse;
    }
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestBody Formation formation) {
        fs.delete(formation);
        return "Record deleted succesfully";
    }
    @GetMapping("/all")
    public List<Formation> findAllProduct(){
        List<Formation> formations = fs.findAll();
        return formations;
    }

}
