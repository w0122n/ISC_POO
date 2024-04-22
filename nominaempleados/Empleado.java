package com.mycompany.nominaempleados;

public abstract class Empleado {
    String nombre;
    double salarioBase;


    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        
    }

    @Override
    public String toString() {
        return "Empleado:" 
                + "\nNombre: " + nombre 
                + "\nSalario: " + salarioBase;
    }
   
    public void calcularSalario(){

    }
}
