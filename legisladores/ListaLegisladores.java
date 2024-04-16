package com.mycompany.legisladores;

import java.util.ArrayList;

public class ListaLegisladores {
    ArrayList<Legislador> listaLegisladores;

    public ListaLegisladores() {
        this.listaLegisladores = new ArrayList();
    }
    
    void agregarLegislador(Legislador leg){
        listaLegisladores.add(leg);
    }
    
    void mostrarLegislador(){
        for (int i=0; i<listaLegisladores.size(); i++){
            Legislador legis = listaLegisladores.get(i);  
        if (legis instanceof Senador){
            Senador senador = (Senador)legis;
            System.out.println(senador.toString());
            System.out.println(senador.getCamaraEnQueTrabaja());
        }
        else
        {
            Diputado dip = (Diputado)legis;
            System.out.println(dip.toString());
            System.out.println(dip.getCamaraEnQueTrabaja());
        }
      }
    }
}


