package com.mycompany.escribefichero1;

import java.io.*;

public class EscribeFichero1 {

    public static void main(String[] args) {
        String cad1 = "Esto es una cadena.";
        String cad2 = "Esto es otra cadena.";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"));
            bw.write(cad1);
            bw.newLine();
            bw.write(cad2);
            bw.flush();
                //Cerramos el stream
            bw.close();
        } catch (IOException ioe) {
            System.out.println("Error IO: " + ioe.toString());
        }
    }
}
