package com.mycompany.legisladores;

public class Senador extends Legislador {

    public Senador(String provRepresenta, String nombre, int edad, String dom) {
        super(provRepresenta, nombre, edad, dom);
    }
    
    @Override
    String getCamaraEnQueTrabaja(){   
        return "Trabaja en la cámara de diputados ";
    }    
    
}
