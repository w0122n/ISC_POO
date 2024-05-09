package com.mycompany.practica03excepciones;

public class clasePractica03Excepciones {
    
    public static void validaPropia(){
    int n= 5;
    
    try {
    minimo(n);
    System.out.println(n + " es mayor a 10");
    }

    catch(MiExcepcion e) {
    System.out.println("No me sirve ese número");

    }
  }  
    /*Método que lanza una Excepción propia*/    
     public static void minimo(int numero) throws MiExcepcion {

        if(numero <= 10) {
        throw new MiExcepcion("Necesito un número mayor a 10");
        }
    }  
}
