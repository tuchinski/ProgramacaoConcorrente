/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide11.ex2;

import java.util.ArrayList;

/**
 *
 * @author tuchinski
 */
public class Baralho {
    String[] naipes;
    String[] valores;
    ArrayList<Carta> cartas;

    public Baralho(String[] naipes, String[] valores, ArrayList<Carta> cartas) {
        this.naipes = naipes;
        this.valores = valores;
        this.cartas = cartas;
    }
    
    void criaBaralho(){
        for (String naipe : this.naipes) {
            for(String valores: this.valores){
                Carta c = new Carta(naipe, valores);
                this.cartas.add(c);
            }
        }
    }
}
