
package com.mycompany.controldecelular;

/**
 *
 * @author hannm
 */
public class Celular {
    // 1.1- Crear clase.
    // 1.2- Crear los atributos. (texto, decimal y boolean)
    String  marca;
    String duenio;
    double precio;
    boolean estado;
    
    
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

    @Override
    public String toString() {
        return "Celular{" + " Marca = " + marca + ", Dueño = " + duenio + ", Precio = " + precio + ", Estado = " + estado + '}';
    }
    
    public void marcarHabilitado (){
        estado =true;
    }    
}
