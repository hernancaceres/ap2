package com.proyectoap2.ap2.Dto;

import javax.validation.constraints.NotBlank;

public class EducacionDto {

    @NotBlank
    private String nombreEdu;
    @NotBlank
    private String institucionEdu;
    @NotBlank
    private String carreraEdu;
    @NotBlank
    private String fechaInicioEdu;
    @NotBlank
    private String fechaFinEdu;
    @NotBlank
    private String paisEdu;
    @NotBlank
    private String descripcionEdu;
    @NotBlank
    private String imgEdu;

    //Constructores
    public EducacionDto() {
    }

    public EducacionDto(String nombreEdu, String institucionEdu, String carreraEdu, String fechaInicioEdu, String fechaFinEdu, String paisEdu, String descripcionEdu, String imgEdu) {
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

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getImgEdu() {
        return imgEdu;
    }

    public void setImgEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }

}
