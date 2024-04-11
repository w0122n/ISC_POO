package com.mycompany.legisladores;

public class Diputado extends Legislador {

    public Diputado(String provRepresenta, String nombre, int edad, String dom) {
        super(provRepresenta, nombre, edad, dom);
    }

    @Override
    String getCamaraEnQueTrabaja(){   
        return "Trabaja en la cámara de diputados ";
    }
}
