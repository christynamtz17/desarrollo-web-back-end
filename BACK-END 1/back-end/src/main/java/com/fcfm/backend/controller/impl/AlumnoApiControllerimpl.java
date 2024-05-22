package com.fcfm.backend.controller.impl;

import com.fcfm.backend.controller.AlumnoApiController;
import com.fcfm.backend.model.Alumno;
import com.fcfm.backend.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoApiControllerimpl implements AlumnoApiController{

    private AlumnoService alumnoService;

    @Autowired
    AlumnoApiControllerimpl(AlumnoService alumnoService){
        this.alumnoService = alumnoService;
    }

    @Override
    public ResponseEntity<List<Alumno>> getAlumnoList() {
    return ResponseEntity.ok().body(alumnoService.getAlumnoList());
    }

    @Override
    public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumnoNuevo){
        alumnoService.createAlumno(alumnoNuevo);
        return ResponseEntity.ok().body(alumnoNuevo);
    }


    @Override
    public ResponseEntity<Alumno> getAlumnoById(@PathVariable int idAlumno){
        return ResponseEntity.ok().body(alumnoService.getAlumnoById(idAlumno));
    }

    public class AlumnoNotFoundException extends RuntimeException {
        public AlumnoNotFoundException(String message) {
            super(message);
        }
    }

    @Override
    public ResponseEntity<?> updateAlumno(Long id, Alumno alumno) {
        try {
            alumnoService.updateAlumno(id, alumno);
            return ResponseEntity.status(HttpStatus.OK).body("La información del alumno fue actualizada correctamente.");
        } catch (AlumnoNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }

    }

    @Override
    public ResponseEntity<?> deleteAlumno(Long id) {
        try {
            alumnoService.deleteAlumno(id);
            return ResponseEntity.status(HttpStatus.OK).body("El alumno fue eliminado correctamente.");
        } catch (AlumnoNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
    }
}

