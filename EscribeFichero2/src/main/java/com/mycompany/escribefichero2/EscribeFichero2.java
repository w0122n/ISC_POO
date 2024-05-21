package com.mycompany.escribefichero2;

import java.io.*;

public class EscribeFichero2 {

    public static void main(String[] args) {
        String cad1 = "Esto es una cadena.";
        String cad2 = "Esto es otra cadena.";
        try {
            PrintWriter salida
                    = new PrintWriter(new BufferedWriter(new FileWriter("salida.txt")));
            salida.println(cad1);
            salida.println(cad2);
                //Cerramos el stream
            salida.close();
        } catch (IOException ioe) {
            System.out.println("Error IO: " + ioe.toString());
        }
    }
}
