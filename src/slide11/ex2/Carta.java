/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide11.ex2;

/**
 *
 * @author a1792334
 */
public class Carta implements Comparable<Carta> {
    private final int numero;
    private final char simbolo;
    private final String naipe;

    public Carta(int numeros, char simbolos, String naipe) {
        this.numero = numeros;
        this.simbolo = simbolos;
        this.naipe = naipe;
    }
    
    
    public int getNumero(){
        return this.numero;
    }
    
    public char simbolo(){
        return this.simbolo;
    }
    
    public String naipe(){
        return this.naipe;
    }

    @Override
    public String toString() {
        return "{" + "numero=" + numero + ", simbolo=" + simbolo + ", naipe=" + naipe + '}';
    }

    @Override
    public int compareTo(Carta o) {
        if(this.numero < o.getNumero()){
            return -1;
        }else if(this.numero == o.getNumero()){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    

    
    
}
