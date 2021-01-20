package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "description")
    private String description ;
    @Column(name = "prerequis")
    private String prerequis;
    @Column(name = "dateD")
    private Date dateD;
    @Column(name = "dateF")
    private Date dateF;
    @Column( name = "formateur")
    private String formateur;
    @Column( name = " nbreLimite")
    private int nbreLimite;
    @Column(name = "catalogue")
    private  String Catalogue;

    public Integer getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrerequis() {
        return prerequis;
    }

    public void setPrerequis(String prerequis) {
        this.prerequis = prerequis;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public Date getDateF() {
        return dateF;
    }

    public void setDateF(Date dateF) {
        this.dateF = dateF;
    }

    public String getFormateur() {
        return formateur;
    }

    public void setFormateur(String formateur) {
        this.formateur = formateur;
    }

    public int getNbreLimite() {
        return nbreLimite;
    }

    public void setNbreLimite(Integer nbreLimite) {
        this.nbreLimite = nbreLimite;
    }

    public String getCatalogue() {
        return Catalogue;
    }

    public void setCatalogue(String catalogue) {
        Catalogue = catalogue;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
