package com.mycompany.practica03excepciones;

public class MiExcepcion extends Exception {
    /*Constructor que regresa el mensaje que se quiere mostrar cuando ocurre la Excepción y se
    lo pasa al constructor de la clase Exception */
        
    public MiExcepcion(String mensajeError){
    super(mensajeError);
    }
}