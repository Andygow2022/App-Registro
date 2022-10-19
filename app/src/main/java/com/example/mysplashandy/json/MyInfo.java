package com.example.mysplashandy.json;

import java.io.Serializable;

public class MyInfo implements Serializable {

    private String nombre;
    private String correo;
    private String contrasena;
    private String numero;
    private String fecha;
    private String edad;
    private String[] escuela;
    private Boolean gen;
    private Boolean noti;
    private Boolean gusta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String user) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String[] getEscuela() {
        return escuela;
    }

    public void setEscuela(String[] escuela) {
        this.escuela = escuela;
    }

    public Boolean getGen() {
        return gen;
    }

    public void setGen(Boolean gen) {
        this.gen = gen;
    }

    public Boolean getNoti() {
        return noti;
    }

    public void setNoti(Boolean noti) {
        this.noti = noti;
    }

    public Boolean getGusta() {
        return gusta;
    }

    public void setGusta(Boolean gusta) {
        this.gusta = gusta;
    }
}
