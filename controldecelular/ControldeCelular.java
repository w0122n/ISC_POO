package com.mycompany.controldecelular;
import static com.mycompany.controldecelular.Validacion.validarDouble;
import static com.mycompany.controldecelular.Validacion.validarString;
import static com.mycompany.controldecelular.Validacion.validarStringM;
import java.util.Scanner;

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
            try {
            System.out.println("Marca del celular: ");
            sc.nextLine();
            marca = sc.nextLine();
                        
            if (validarStringM(marca)){
            System.out.println("El nombre es válido.");
            } else {
            System.out.println("El nombre no es válido.");
            }
                        
            System.out.println("Nombre del dueño: ");
            duenio = sc.nextLine();
                        
            if (validarString(duenio)){
            System.out.println("El nombre es válido.");
            } else {
            System.out.println("El nombre no es válido.");
            }
                        
            System.out.println("Precio del celular: ");
            precio = sc.nextDouble();  
            celular = new Celular(marca, duenio, precio);
                        
            if (validarDouble(precio)){
            System.out.println("El número es válido.");
             } else {
            System.out.println("El número no es válido.");
            }
            
            } catch (Exception VF){
             System.out.println("Ha ocurrido un error. " + VF.getMessage());                        
            }
                       
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
