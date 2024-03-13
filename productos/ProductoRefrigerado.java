package com.mycompany.productos;

/**
 *
 * @author SALA PAFP 30
 */
public class ProductoRefrigerado extends Productos {
    String cosa;

    public ProductoRefrigerado(String cosa, String fechaCad, int numLote) {
        super(fechaCad, numLote);
        this.cosa = cosa;
    }

    public String getCosa() {
        return cosa;
    }

    public void setCosa(String cosa) {
        this.cosa = cosa;
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
        return "ProductoRefrigerado{" + "código de supervisión alimentaria: " + cosa + '}';
    }

}
