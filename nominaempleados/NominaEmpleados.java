package com.mycompany.nominaempleados;

import java.util.Scanner;

public class NominaEmpleados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nom, nomb; // Se crean 2 variables para para almacenar
        int hrs;          // el nombre del empleado y las hrs trabajadas.
        
        // Se piden los datos´del empleado asalariado.
        System.out.println("== EMPLEADO POR ASALARIADO ==");
        System.out.println("Nombre: ");
        nom = sc.nextLine();
        // Se calcula el salario.
        Empleado empleadoAsalariado = new EmpleadoAsalariado(nom, 20000);
        empleadoAsalariado.calcularSalario();
        
        // Se piden los datos para el empleado por horas.
        System.out.println("== EMPLEADO POR HORAS ==");
        System.out.println("Nombre: ");
        nomb = sc.nextLine();
        System.out.println("Horas trabajadas: ");
        hrs = sc.nextInt(); sc.nextLine();
        // Se calcula el salario.
        Empleado empleadoHrs = new EmpleadoPorHoras(hrs, nomb, 120);
        empleadoHrs.calcularSalario();
        
    }
}
