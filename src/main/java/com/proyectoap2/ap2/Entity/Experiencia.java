package com.proyectoap2.ap2.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String modalidadE;
    private String empresaE;
    private String fechaInicioExp;
    private String fechaFinExp;
    private String pais;

    @Column(length = 1000)
    private String descripcionE;
    
    private String imgExp;

    //Constructores
    public Experiencia() {
    }

    public Experiencia(String nombreE, String modalidadE, String empresaE, String fechaInicioExp, String fechaFinExp, String pais, String descripcionE, String imgExp) {
        this.nombreE = nombreE;
        this.modalidadE = modalidadE;
        this.empresaE = empresaE;
        this.fechaInicioExp = fechaInicioExp;
        this.fechaFinExp = fechaFinExp;
        this.pais = pais;
        this.descripcionE = descripcionE;
        this.imgExp = imgExp;
    }

   

    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getModalidadE() {
        return modalidadE;
    }

    public void setModalidadE(String modalidadE) {
        this.modalidadE = modalidadE;
    }

    public String getEmpresaE() {
        return empresaE;
    }

    public void setEmpresaE(String empresaE) {
        this.empresaE = empresaE;
    }

    public String getFechaInicioExp() {
        return fechaInicioExp;
    }

    public void setFechaInicioExp(String fechaInicioExp) {
        this.fechaInicioExp = fechaInicioExp;
    }

    public String getFechaFinExp() {
        return fechaFinExp;
    }

    public void setFechaFinExp(String fechaFinExp) {
        this.fechaFinExp = fechaFinExp;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }
  

}
