package com.mycompany.productos;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author SALA PAFP 30
 */
public class ejercicoHerencia1 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String nom, fechaEnva, fechaCad, paisOrig, cosa;
        int numLote, tempRecom;
        
        ProductosFrescos pf = null;
        ProductoRefrigerado pr = null;
        ProductosCongelados pc = null;
        do {
        System.out.println("==== Géstion de Productos ====");
        System.out.println("1 Producto fresco");
        System.out.println("2 Producto refrigerado");
        System.out.println("3 Producto congelado");            
        System.out.println("4 Salir");  
        int op= sc.nextInt(); sc.nextLine();
        
        switch(op){
            
            case 1:
            System.out.println("Nombre del producto: ");
            nom = sc.nextLine();
            System.out.println("Número de lote: ");
            numLote= sc.nextInt(); sc.nextLine();
            System.out.println("Fecha de caducidad: ");
            fechaCad= sc.nextLine();
            System.out.println("Fecha de envasado: ");
            fechaEnva= sc.nextLine();
                 
            }
        }   
    }
}
