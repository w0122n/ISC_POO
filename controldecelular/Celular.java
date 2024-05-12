package com.mycompany.controldecelular;

public class Celular {
    // 1.1- Crear clase.
    // 1.2- Crear los atributos. (texto, decimal y boolean)
    private String  marca;
    private String duenio;
    private double precio;
    private boolean estado;
    
    
    //1.3 Crear el constructor.
    public Celular(String marca, String duenio, double precio) {
        this.marca = marca;
        this.duenio = duenio;
        this.precio = precio;
        this.estado = false;
    }
   
    //1.4.- Crear métodos (set y get).

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDueno() {
        return duenio;
    }

    public void setDueno(String dueno) {
        this.duenio = dueno;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void marcarHabilitado (){
        estado =true;
    }    
    
    public boolean estaHabilitado(){
        return estado;
    } 

    @Override
    public String toString() {
        return "Celular:" + 
                "\nMarca: " + marca 
                + "\nDueño: " + duenio 
                + "\nPrecio: " + precio 
                + "\nEstado: " + estado;
    }
  
}
