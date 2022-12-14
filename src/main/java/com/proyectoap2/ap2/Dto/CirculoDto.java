package com.proyectoap2.ap2.Dto;

import javax.validation.constraints.NotBlank;

public class CirculoDto {

    @NotBlank
    private String nombreC;
    @NotBlank
    private int porcentaje;

    //Constructores
    public CirculoDto() {
    }

    public CirculoDto(String nombreC, int porcentaje) {
        this.nombreC = nombreC;
        this.porcentaje = porcentaje;
    }

    //Getters and Setters
    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

}
