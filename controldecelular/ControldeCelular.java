/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controldecelular;
import java.util.Scanner;

/**
 *
 * @author hannm
 */
public class ControldeCelular {
    // 1. Crear proyecto.
    public static void main(String[] args) {
          Scanner sc= new Scanner (System.in);  
    String  marca;
    String duenio;
    double precio;
    int op;
    
    Celular celular=null;
            
        // 2. Crear menú.

            do{
            System.out.println("Elige el numero de conversion a realizar");
            System.out.println("1. Construir un celular");
            System.out.println("2. Habilitar celular");
            System.out.println("3. Mostrar datos del celular");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción");

            op= sc.nextInt();
            switch(op){
                case 1:
                    // 2.1 Al elegir la opción 1, se podra ´crear´ el celular.
                        System.out.println("Marca del celular: ");
                        sc.nextLine();
                        marca = sc.nextLine();
                        System.out.println("Nombre del dueño: ");
                        duenio = sc.nextLine();
                        System.out.println("Precio del celular: ");
                        precio = sc.nextDouble();  
                        celular = new Celular(marca, duenio, precio);
                    break;
                case 2:
                    
                    celular.marcarHabilitado();
                    System.out.println("Su celular se ha habilitado correctamente.");
                    break;
                    
                case 3:
                    
                    System.out.println(celular);
                    break;
                    
                case 4:
                    
                    System.out.println("¡Hasta pronto!");
            }
            }while(op!=4);
    }
}
