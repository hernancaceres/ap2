
package com.proyectoap2.ap2.Repository;

import com.proyectoap2.ap2.Entity.Circulo;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CirculoRepository extends JpaRepository<Circulo, Integer>{
    
     Optional<Circulo> findByNombreC(String nombreC);
    public boolean existsByNombreC(String nombreC);
}
