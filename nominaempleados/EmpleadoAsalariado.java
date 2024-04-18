package com.mycompany.nominaempleados;

public class EmpleadoAsalariado extends Empleado {

    public EmpleadoAsalariado(String nombre, double salarioBase, String dpto) {
        super(nombre, salarioBase, dpto);
        this.salarioBase = 20000;
    }
    
    
}
