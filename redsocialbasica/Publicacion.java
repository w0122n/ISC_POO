package com.mycompany.redsocialbasica;

import java.util.Date;


/**
 *
 * @author hannm
 */
public class Publicacion {
    //1.1- Crear la clase.
    //1.2- Crear atributos.
       
       String autor;
       String contenido;
       Date fechaPublicacion;
       int likes;
     
    // 1.3- Crear un constructor.

    public Publicacion(String autor, String contenido) {
        this.autor = autor;
        this.contenido = contenido;
        this.fechaPublicacion = new Date(); //Es la fecha en la que la publicación fue creada.
        this.likes = 0;
    }
    
    // 1.4- Crear métodos get.

    public String getAutor() {
        return autor;
    }

    public String getContenido() {
        return contenido;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public int getLikes() {
        return likes;
    }
    
    public void anadirLikes(){
        likes++;
    }
    
    // 1.5-Crear métodos set.

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    
}
