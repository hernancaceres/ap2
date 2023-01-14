package com.proyectoap2.ap2.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEdu;
    private String institucionEdu;
    private String carreraEdu;
    private String fechaInicioEdu;
    private String fechaFinEdu;
    private String paisEdu;

    @Column(length = 1000)
    private String descripcionEdu;

    private String imgEdu;

    //Constructores
    public Educacion() {
    }

    public Educacion(String nombreEdu, String institucionEdu, String carreraEdu, String fechaInicioEdu, String fechaFinEdu, String paisEdu, String descripcionEdu, String imgEdu) {
        this.nombreEdu = nombreEdu;
        this.institucionEdu = institucionEdu;
        this.carreraEdu = carreraEdu;
        this.fechaInicioEdu = fechaInicioEdu;
        this.fechaFinEdu = fechaFinEdu;
        this.paisEdu = paisEdu;
        this.descripcionEdu = descripcionEdu;
        this.imgEdu = imgEdu;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getInstitucionEdu() {
        return institucionEdu;
    }

    public void setInstitucionEdu(String institucionEdu) {
        this.institucionEdu = institucionEdu;
    }

    public String getCarreraEdu() {
        return carreraEdu;
    }

    public void setCarreraEdu(String carreraEdu) {
        this.carreraEdu = carreraEdu;
    }

    public String getFechaInicioEdu() {
        return fechaInicioEdu;
    }

    public void setFechaInicioEdu(String fechaInicioEdu) {
        this.fechaInicioEdu = fechaInicioEdu;
    }

    public String getFechaFinEdu() {
        return fechaFinEdu;
    }

    public void setFechaFinEdu(String fechaFinEdu) {
        this.fechaFinEdu = fechaFinEdu;
    }

    public String getPaisEdu() {
        return paisEdu;
    }

    public void setPaisEdu(String paisEdu) {
        this.paisEdu = paisEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionE(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getImgEdu() {
        return imgEdu;
    }

    public void setImgEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }

}
