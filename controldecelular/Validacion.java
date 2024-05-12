package com.mycompany.controldecelular;

public class Validacion {
    
    // Creamos el método para validar.
    public static boolean validarDouble (double precio){
        
        // Se verifica si el valor no es un número o infinito.
        
        if (Double.isNaN(precio) || Double.isInfinite(precio)){
        //Se lanza la excepción si el valor no es valido.
        throw new IllegalArgumentException("El valor introducido no es un número válido.");   
    }
        return precio % 1 != 0;
}
     public static boolean validarString(String duenio) {
        // verificamos si es que las cadenas no contienen solo letras.
        if (!duenio.matches("[a-zA-Z]+")) {
        //Se lanza la excepción si las cadenas contienen caracteres no permitidos.
        throw new IllegalArgumentException("La palabra contiene caracteres no permitidos.");
    }
        return true;
}
      public static boolean validarStringM(String marca) {

        if (!marca.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("La palabra contiene caracteres no permitidos.");
    }
        return true;
    }
}
