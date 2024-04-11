package com.mycompany.legisladores;


public abstract class Persona {
    String nombre;
    int edad;
    String dom;

    public Persona(String nombre, int edad, String dom) {
        this.nombre = nombre;
        this.edad = edad;
        this.dom = dom;
    }

    @Override
    public String toString() {
        return "Persona"
                + "Nombre. " + nombre
                + "Edad. " + edad 
                + "Domicilio. " + dom;
    }
    
}
