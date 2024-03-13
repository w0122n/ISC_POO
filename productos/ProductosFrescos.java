package com.mycompany.productos;

import java.util.Date;

/**
 *
 * @author SALA PAFP 30
 */
public class ProductosFrescos extends Productos {
    Date fechaEnvasado;
    String paisOrig;

    public ProductosFrescos(Date fechaEnvasado, String paisOrig, String fechaCad, int numLote) {
        super(fechaCad, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrig = paisOrig;
    }

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrig() {
        return paisOrig;
    }

    public void setPaisOrig(String paisOrig) {
        this.paisOrig = paisOrig;
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
        return "ProductosFrescos{" + "fecha de envasado: " + fechaEnvasado + ", pais de origen: " + paisOrig + '}';
    }
     
}
