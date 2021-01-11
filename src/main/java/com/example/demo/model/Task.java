package com.example.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GenericGenerator(name="yoyo" , strategy="increment")
    //@GeneratedValue(generator="yoyo")
    private Integer id;
    @Column(name = "label")
    private String label;
    @Column(name = "completed")
    private Boolean completed;

    public Integer getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public Boolean getCompleted() {
        return completed;
    }
}
