package com.proyectoap2.ap2.Controller;

import com.proyectoap2.ap2.Dto.EducacionDto;
import com.proyectoap2.ap2.Entity.Educacion;
import com.proyectoap2.ap2.Security.Controller.Mensaje;
import com.proyectoap2.ap2.Service.EducacionService;
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
@RequestMapping("/educacion")
@CrossOrigin(origins = { "https://frontendap2.web.app", "http://localhost:4200","https://portfolio-frontend-12545.web.app" }) 
public class EducacionController {

    @Autowired
    EducacionService educacionService;

    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list() {
        List<Educacion> list = educacionService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id) {
        if (!educacionService.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = educacionService.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!educacionService.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        educacionService.delete(id);
        return new ResponseEntity(new Mensaje("Educacion eliminada"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody EducacionDto dtoeducacion) {
        if (StringUtils.isBlank(dtoeducacion.getNombreEdu())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (educacionService.existsByNombreEdu(dtoeducacion.getNombreEdu())) {
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = new Educacion(
                dtoeducacion.getNombreEdu(),dtoeducacion.getInstitucionEdu(),dtoeducacion.getCarreraEdu(),dtoeducacion.getFechaInicioEdu(),dtoeducacion.getFechaFinEdu(),dtoeducacion.getPaisEdu(), dtoeducacion.getDescripcionEdu(), dtoeducacion.getImgEdu()
        );
        educacionService.save(educacion);
        return new ResponseEntity(new Mensaje("Educacion creada"), HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody EducacionDto dtoeducacion) {
        if (!educacionService.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if (educacionService.existsByNombreEdu(dtoeducacion.getNombreEdu()) && educacionService.getByNmbreEdu(dtoeducacion.getNombreEdu()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoeducacion.getNombreEdu())) {
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }

        Educacion educacion = educacionService.getOne(id).get();

        educacion.setNombreEdu(dtoeducacion.getNombreEdu());
        educacion.setInstitucionEdu(dtoeducacion.getInstitucionEdu());
        educacion.setCarreraEdu(dtoeducacion.getCarreraEdu());
        educacion.setFechaInicioEdu(dtoeducacion.getFechaInicioEdu());
        educacion.setFechaFinEdu(dtoeducacion.getFechaFinEdu());
        educacion.setPaisEdu(dtoeducacion.getPaisEdu());
        educacion.setDescripcionEdu(dtoeducacion.getDescripcionEdu());
        educacion.setImgEdu(dtoeducacion.getImgEdu());
        

        educacionService.save(educacion);

        return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);
    }

}
