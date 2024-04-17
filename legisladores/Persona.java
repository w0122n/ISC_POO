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
        return "Persona "
                + "\nNombre. " + nombre
                + "\nEdad. " + edad 
                + "\nDomicilio. " + dom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }
    
    
}
