package com.mycompany.productos;


/**

 * @author SALA PAFP 30
 */

public class Productos {

        String fechaCad;
        int numLote;

    public Productos(String fechaCad, int numLote) {
        this.fechaCad = fechaCad;
        this.numLote = numLote;
    }

    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    @Override
    public String toString() {
        return "Productos{" + "fecha caducidad: " + fechaCad + ", número de lote: " + numLote + '}';
    }
        
        
}
