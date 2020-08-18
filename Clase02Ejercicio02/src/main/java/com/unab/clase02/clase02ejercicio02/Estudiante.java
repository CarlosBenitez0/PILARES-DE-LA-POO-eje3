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
public class Estudiante extends Persona{
    private int Matricula;
    private String Carrera;
    
    public Estudiante
    (String Nombre, String Direccion, String FechaNC, String Genero, int Edad, int Matricula, String Carrera){
    this.Nombre = Nombre;
    this.Edad = Edad;
    this.Genero = Genero;
    this.FechaNC = FechaNC;
    this.Direccion = Direccion;
    this.Carrera = Carrera;
    this.Matricula = Matricula;
    }

    @Override
    public String toString() {
        return "Estudiante{" +"Nombre=" + Nombre + ", Direccion=" + Direccion + ", FechaNC=" + FechaNC + ", Genero=" + Genero + ", Edad=" + Edad + ", Matricula=" + Matricula + ", Carrera=" + Carrera + '}';
    }
    
}
