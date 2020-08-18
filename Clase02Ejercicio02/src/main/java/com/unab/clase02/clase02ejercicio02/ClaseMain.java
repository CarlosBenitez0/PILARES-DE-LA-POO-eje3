package com.unab.clase02.clase02ejercicio02;

public class ClaseMain {

    public static void main(String[] args) {
        Profesor profe =  new Profesor("Carlos","Chalatenango","16/02/2000","M",25,"Est de ING","Estudiante");
        Estudiante est = new Estudiante("Giselle","Chalatenango","16/02/2000","F",18,1500,"Leyes");
        
        System.out.println(profe.toString());
        System.out.println(est.toString());
        
        
    }

}
