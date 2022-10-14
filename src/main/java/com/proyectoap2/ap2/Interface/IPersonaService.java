package com.proyectoap2.ap2.Interface;

import com.proyectoap2.ap2.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer una lista de personas.

    public List<Persona> getPersona();

    //guardar un obgeto de tipo persona.
    public void savePersona(Persona persona);

    //eliminar un objeto, lo buscamos por id
    public void deletePersona(Long id);

    //buscar una persona por id
    public Persona findPersona(Long id);
}
