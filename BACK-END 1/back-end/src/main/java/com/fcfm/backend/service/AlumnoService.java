package com.fcfm.backend.service;

import com.fcfm.backend.model.Alumno;

import java.util.List;


public interface AlumnoService {
    void createAlumno(Alumno newAlumno);

     List<Alumno> getAlumnoList();

    Alumno getAlumnoById(int id) ;


    void updateAlumno(Long id, Alumno alumno);

    void deleteAlumno(Long id);
    }

