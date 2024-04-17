package com.mycompany.legisladores;

public abstract class Legislador extends Persona {
    
    String provRepresenta;

    public Legislador(String provRepresenta, String nombre, int edad, String dom) {
        super(nombre, edad, dom);
        this.provRepresenta = provRepresenta;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nEl legislador representa a la provincia: " + provRepresenta;
    }
    
    abstract String getCamaraEnQueTrabaja();
    
}
