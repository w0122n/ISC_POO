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
        Scanner sc = new Scanner(System.in);
        int opc, edad;
        String nombre, dom, prov;
        
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Edad: ");
        edad = sc.nextInt();
        System.out.println("Domicilio: ");
        dom = sc.nextLine();
        System.out.println("Provincia que representa: ");
        prov = sc.nextLine();
            
        System.out.println("Elige el tipo de legislador");
        System.out.println("1. Crear diputado");
        System.out.println("2. Crear senador");
        opc = sc.nextInt();
        
        if(opc==1){
            Diputado dip = new Diputado(prov, nombre, edad, dom);
            listLeg.agregarLegislador(dip);
        }
        if(opc==2){
            Senador senador = new Senador(prov, nombre, edad, dom);
            listLeg.agregarLegislador(senador);

             }
        }
    }
