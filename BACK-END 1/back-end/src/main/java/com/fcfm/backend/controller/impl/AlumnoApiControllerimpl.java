package com.fcfm.backend.controller.impl;

import com.fcfm.backend.controller.AlumnoApiController;
import com.fcfm.backend.controller.model.Alumno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Repeatable;

@RestController
public class AlumnoApiControllerimpl implements AlumnoApiController{
    @Override
    public ResponseEntity<String> getName() {
    return ResponseEntity.ok().body("Alicia Christyna Martinez Parra");
    }

    @Override
    public ResponseEntity<String> getName(@PathVariable String nombreAlumno){
        return ResponseEntity.ok().body(nombreAlumno);
    }

    @Override
    public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumnoNuevo){
        return ResponseEntity.ok().body(alumnoNuevo);
    }
}
