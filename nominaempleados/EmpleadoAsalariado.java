package com.mycompany.nominaempleados;

public class EmpleadoAsalariado extends Empleado {

    public EmpleadoAsalariado(String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.salarioBase = 20000;
    }
    @Override
    public void calcularSalario(){
        double salario;
        salario = salarioBase - (0.32 * salarioBase );
        System.out.println("Salario $" + salario);
    }
    
}
