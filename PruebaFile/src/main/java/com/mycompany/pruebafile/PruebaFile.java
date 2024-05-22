package com.mycompany.pruebafile;
import java.io.File;

public class PruebaFile {

   //muestra información acerca de un fichero y un directorio
    public static void main(String[] args) {
        File fichero = new File("ejemplo.txt");
          if (fichero.exists() && fichero.isFile()) {
            System.out.println("\n- Información del fichero:");
            System.out.println("El fichero tiene el nombre: " + fichero.getName());
            System.out.println("El fichero tiene el path: " + fichero.getAbsolutePath());
            System.out.println("Longitud del fichero: " + fichero.length());
            }

        File directorio = new File("C:\\Users\\SALA PAFP 30\\Documents\\NetBeansProjects\\PruebaFile");
          if (directorio.exists() && directorio.isDirectory()) {
            String listado[] = directorio.list();
            System.out.println("\n- Listado del directorio:");
          for (int i = 0; i < listado.length; i++) {
            System.out.println(listado[i] + "\n");
            }
        }
    }
}
