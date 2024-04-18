package com.mycompany.nominaempleados;

public abstract class Empleado {
    String nombre;
    double salarioBase;
    String dpto;

    public Empleado(String nombre, double salarioBase, String dpto) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.dpto = dpto;
    }

    @Override
    public String toString() {
        return "Empleado:" 
                + "\nNombre: " + nombre 
                + "\nSalario: " + salarioBase 
                + "\nDepartamento al que pertenece: " + dpto;
    }
    
}
