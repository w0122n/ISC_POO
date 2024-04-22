package com.mycompany.nominaempleados;

public class EmpleadoPorHoras extends Empleado {
    
    int hrsTrabajadas;

    public EmpleadoPorHoras(int hrsTrabajadas, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.hrsTrabajadas = hrsTrabajadas;
        this.salarioBase = 120;

    }

    @Override
    public void calcularSalario(){
    double salario;
    salario = salarioBase * hrsTrabajadas;
    System.out.println("Salario $" + salario);
    
    }
}
