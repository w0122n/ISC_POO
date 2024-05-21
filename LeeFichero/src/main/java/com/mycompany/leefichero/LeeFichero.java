package com.mycompany.leefichero;
import java.io.*;

public class LeeFichero {

    public static void main(String[] args) {
        String cad;
        try {
            BufferedReader br
                    = new BufferedReader(new FileReader("ejemplo.txt"));
            while ((cad = br.readLine()) != null) {
                System.out.println(cad);
            }
                //Cerramos el stream
            br.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
