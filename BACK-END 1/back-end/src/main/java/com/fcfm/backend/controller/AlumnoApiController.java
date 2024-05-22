package com.fcfm.backend.controller;

import com.fcfm.backend.model.Alumno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/alumno")
public interface AlumnoApiController {


    @GetMapping("/{idAlumno}")
    ResponseEntity<Alumno> getAlumnoById(@PathVariable int idAlumno);

    @PostMapping("/")
    ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumnoNuevo);

    @GetMapping("/")
    ResponseEntity<List<Alumno>> getAlumnoList();

    @PutMapping("/alumnos/{id}")
    ResponseEntity<?> updateAlumno(@PathVariable Long id, @RequestBody Alumno alumno);

    @DeleteMapping("/alumnos/{id}")
    ResponseEntity<?> deleteAlumno(@PathVariable Long id);

}

