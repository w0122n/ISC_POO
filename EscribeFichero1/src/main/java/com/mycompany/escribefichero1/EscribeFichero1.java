package com.mycompany.escribefichero1;

import java.io.*;

public class EscribeFichero1 {

    public static void main(String[] args) {
        String cad1 = "Hola que tal.";
        String cad2 = "Esto es otra cadena.";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\SALA PAFP 30\\Documents\\NetBeansProjects\\EscribeFichero1\\salida.txt"));
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
