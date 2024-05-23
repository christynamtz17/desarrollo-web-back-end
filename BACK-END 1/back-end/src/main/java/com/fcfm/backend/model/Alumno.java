package com.fcfm.backend.model;

import java.util.Date;

public class Alumno {

    private String primerNombre;

    private String segundoNombre;

    private String apellidoPat;

    private String apellidoMat;

    private Integer edad;

    private String email;

    private String Curp;

    private String telefono;

    private Date FechaNac;

    public String getprimerNombre() {
        return primerNombre;
    }

    public void setprimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getsegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getCurp() {return Curp; }

    public void setCurp(String Curp) {
        this.Curp = Curp;
    }

    public Date getFechaNac() {return FechaNac; }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public Integer getEdad(){
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

}



