package com.example.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GenericGenerator(name="kaugen" , strategy="increment")
    //@GeneratedValue(generator="kaugen")
    private Integer id;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "code")
    private String code;

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getCode() {
        return code;
    }
}
