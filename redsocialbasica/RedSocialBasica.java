package com.mycompany.redsocialbasica;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hannm
 */
public class RedSocialBasica {

    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       //1. Crear proyecto.
       
       String autor;
       String contenido;
       Date fechaPublicacion;
       int likes;
       int op;
       
       Publicacion publi=null;      
        
        // 2. Crear menú.
        do{        System.out.println("==== GESTOR DE PUBLICACIONES ====");
        System.out.println("1. Crear una nueva publicación");
        System.out.println("2. Dar like a la publicación");
        System.out.println("3. Mostrar la publicación");
        System.out.println("4. Salir");
        System.out.println("Selecciona una opción: ");
        op = sc.nextInt();
            
            switch (op){
                
                case 1:

                    System.out.println("Nombre del autor: ");
                    sc.nextLine();
                    autor = sc.nextLine();
                    System.out.println("Escriba el contenido: ");
                    contenido = sc.nextLine();
                    publi = new Publicacion(autor,contenido);
                break;
                
                case 2:
                    publi.anadirLikes();
                    System.out.println("¡¡Le diste like a esta publicación!!");
                break;
                
                case 3:
                    System.out.println("Autor: " + publi.getAutor());
                    System.out.println("Contenido: " + publi.getContenido());
                    System.out.println("Fecha de publicación: " + publi.getFechaPublicacion());
                    System.out.println("Likes: " + publi.getLikes());
                break;
                
                case 4:
                    System.out.println("¡Hasta pronto!");                    
            }
        
        } while(op!=4);
    }
} 
