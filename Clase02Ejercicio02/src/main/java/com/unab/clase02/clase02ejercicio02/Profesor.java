/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.clase02ejercicio02;

/**
 *
 * @author cb272
 */
public class Profesor extends Persona {

    private String Titulo, Dedicacion;

    public Profesor
        (String Nombre, String Direccion, String FechaNC, String Genero, int Edad, String Titulo, String Dedicacion) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Genero = Genero;
        this.FechaNC = FechaNC;
        this.Direccion = Direccion;
        this.Titulo = Titulo;
        this.Dedicacion = Dedicacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDedicacion() {
        return Dedicacion;
    }

    public void setDedicacion(String Dedicacion) {
        this.Dedicacion = Dedicacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getFechaNC() {
        return FechaNC;
    }

    public void setFechaNC(String FechaNC) {
        this.FechaNC = FechaNC;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "Nombre=" + Nombre + ", Direccion=" + Direccion + ", FechaNC=" + FechaNC + ", Genero=" + Genero + ", Edad=" + Edad + ", Titulo=" + Titulo + ", Dedicacion=" + Dedicacion + '}';
    }
        
}
