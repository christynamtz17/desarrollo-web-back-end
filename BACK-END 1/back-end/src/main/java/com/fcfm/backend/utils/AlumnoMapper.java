package com.fcfm.backend.utils;

import com.fcfm.backend.model.Alumno;

import java.util.Date;

public class AlumnoMapper {
    public static com.fcfm.backend.model.Alumno alumnoEntityToAlumnoModel(Alumno alumno){
        com.fcfm.backend.model.Alumno model = new com.fcfm.backend.model.Alumno();
        model.setprimerNombre(alumno.getPrimerNombre());
        model.setSegundoNombre(alumno.getsegundoNombre());
        model.setApellidoPat(alumno.getApellidoPat());
        model.setApellidoMat(alumno.getApellidoMat());
        model.setFechaNac(alumno.getFechaNac().toString());
        model.setCurp(alumno.getCurp());
        model.setEmail(alumno.getEmail());
        return model;
    }

    public static com.fcfm.backend.repository.entity.Alumno alumnoModelToAlumnoEntity(Alumno alumno){
        Alumno entity = new com.fcfm.backend.entity.Alumno();
        entity.setprimerNombre(alumno.getPrimerNombre());
        entity.setSegundoNombre(alumno.getsegundoNombre());
        entity.setApellidoPat(alumno.getApellidoPat());
        entity.setApellidoMat(alumno.getApellidoMat());
        entity.setFechaNac(Date.valueOf(alumno.getFechaNac()));
        entity.setCurp(alumno.getCurp());
        entity.setEmail(alumno.getEmail());
        return entity;
    }
}
