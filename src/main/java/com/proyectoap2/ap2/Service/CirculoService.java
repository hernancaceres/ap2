package com.proyectoap2.ap2.Service;

import com.proyectoap2.ap2.Entity.Circulo;
import com.proyectoap2.ap2.Repository.CirculoRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class CirculoService {

    @Autowired
    CirculoRepository circuloRepository;

    public List<Circulo> list() {
        return circuloRepository.findAll();
    }

    public Optional<Circulo> getOne(int id) {
        return circuloRepository.findById(id);
    }

    public Optional<Circulo> getByNombre(String nombreC) {
        return circuloRepository.findByNombre(nombreC);
    }

    public void save(Circulo skill) {
        circuloRepository.save(skill);
    }

    public void delete(int id) {
        circuloRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return circuloRepository.existsById(id);
    }

    public boolean existsByNombre(String nombreC) {
        return circuloRepository.existsByNombre(nombreC);
    }
}
