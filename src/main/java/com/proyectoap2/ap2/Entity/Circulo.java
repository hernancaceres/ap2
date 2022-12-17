
package com.proyectoap2.ap2.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Circulo {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreC;
    private int porcentaje;
    
    //Constructores

    public Circulo() {
    }


    public Circulo(String nombreC, int porcentaje) {
        this.nombreC = nombreC;
        this.porcentaje = porcentaje;
    }
      
    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
