package com.mycompany.productos;

/**
 *
 * @author SALA PAFP 30
 */
public class ProductosCongelados extends Productos {
    int tempRecomendada;

    public ProductosCongelados(int tempRecomendada, String fechaCad, int numLote) {
        super(fechaCad, numLote);
        this.tempRecomendada = tempRecomendada;
    }

    public int getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(int tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
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
        return "ProductosCongelados{" + "temperatura recomendada: " + tempRecomendada + '}';
    }

}
