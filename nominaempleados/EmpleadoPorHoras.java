package com.mycompany.nominaempleados;

public class EmpleadoPorHoras extends Empleado {
    
    int hrsTrabajadas;

    public EmpleadoPorHoras(int hrsTrabajadas, String nombre, double salarioBase, String dpto) {
        super(nombre, salarioBase, dpto);
        this.hrsTrabajadas = hrsTrabajadas;
        this.salarioBase = 120;
        
        
    }

    
}
