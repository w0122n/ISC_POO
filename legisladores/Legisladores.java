package com.mycompany.legisladores;
import java.util.Scanner;

public class Legisladores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ListaLegisladores listLeg = new ListaLegisladores();
        
        int op;
        do{
        System.out.println("Cámara de Diputados y Senadores");
        System.out.println("Seleccione una opción.");
        System.out.println("1. Crear legislador");
        System.out.println("2. Mostar legisladores");
        System.out.println("3. Salir");
        op = sc.nextInt();
        
        switch(op){
            case 1:
                crearLegislador();
                break;
            case 2:
                listLeg.mostrarLegislador();
                break;
            case 3:
                System.out.println("Adios!");
                break;
            default:
                System.out.println("Opción invalidad.");
            }
        }while(op<3);
    }
    
    static void crearLegislador(ListaLegisladores listLeg){
        
    }
}
