package com.proyectoap2.ap2.Repository;

import com.proyectoap2.ap2.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer> {

    public Optional<Educacion> findByNombreEdu(String nombreEdu);

    public boolean existsByNombreEdu(String nombreEedu);

}
