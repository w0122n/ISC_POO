package com.mycompany.practica02excepciones;

public class clasePractica02Excepciones {
    
        public static int convertir(String dato) throws NumberFormatException{

        int convertido = 5;
        convertido = Integer.parseInt(dato);
        return convertido;
    }
        public static void atrapandoExcepciones(){
            try{
            System.out.println("Convertido: " + convertir("Palabra"));
                }

            catch(NumberFormatException e){
            System.out.println("No puedo realizar la conversión");
            }
        }
}
