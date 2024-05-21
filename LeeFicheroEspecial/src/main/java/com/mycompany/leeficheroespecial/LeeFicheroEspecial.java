package com.mycompany.leeficheroespecial;

public class LeeFicheroEspecial {

    public static void main(String[] args) {
        String cad;
        try {
            FileInputStream fis = new FileInputStream("ejemplo.txt");
            InputStreamReader isr = new InputStreamReader(fis, "ISO-8859-1");
            BufferedReader br = new BufferedReader(isr);
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
