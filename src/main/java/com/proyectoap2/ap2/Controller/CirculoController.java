package com.proyectoap2.ap2.Controller;

import com.proyectoap2.ap2.Dto.CirculoDto;
import com.proyectoap2.ap2.Entity.Circulo;
import com.proyectoap2.ap2.Security.Controller.Mensaje;
import com.proyectoap2.ap2.Service.CirculoService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill")
@CrossOrigin(origins = { "https://frontendap2.web.app", "http://localhost:4200" }) 
public class CirculoController {

    @Autowired
    CirculoService circuloService;

    @GetMapping("/lista")
    public ResponseEntity<List<Circulo>> list() {
        List<Circulo> list = circuloService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Circulo> getById(@PathVariable("id") int id) {
        if (!circuloService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Circulo circulo = circuloService.getOne(id).get();
        return new ResponseEntity(circulo, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!circuloService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        circuloService.delete(id);
        return new ResponseEntity(new Mensaje("Skill eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody CirculoDto circuloDto) {
        if (StringUtils.isBlank(circuloDto.getNombreC())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (circuloService.existsByNombre(circuloDto.getNombreC())) {
            return new ResponseEntity(new Mensaje("Esa skill ya existe"), HttpStatus.BAD_REQUEST);
        }

        Circulo circulo = new Circulo(circuloDto.getNombreC(), circuloDto.getPorcentaje());
        circuloService.save(circulo);

        return new ResponseEntity(new Mensaje("Skill agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody CirculoDto circuloDto) {
        //Validamos si existe el ID
        if (!circuloService.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //Compara nombre de skills
        if (circuloService.existsByNombre(circuloDto.getNombreC()) && circuloService.getByNombre(circuloDto.getNombreC()).get()
                .getId() != id) {
            return new ResponseEntity(new Mensaje("Esa skill ya existe"), HttpStatus.BAD_REQUEST);
        }
        //No puede estar vacio
        if (StringUtils.isBlank(circuloDto.getNombreC())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Circulo circulo = circuloService.getOne(id).get();
        circulo.setNombre(circuloDto.getNombreC());
        circulo.setPorcentaje(circuloDto.getPorcentaje());

        circuloService.save(circulo);
        return new ResponseEntity(new Mensaje("Skill actualizada"), HttpStatus.OK);

    }

}
