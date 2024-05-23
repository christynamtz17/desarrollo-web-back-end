package com.fcfm.backend.repository.entity;

import com.fcfm.backend.repository.entity.Alumno;

import  java.util.List;

public interface AlumnoRepository {

    void insertar(Alumno alumno);

    Alumno getAlumnoById(Long id);

}
