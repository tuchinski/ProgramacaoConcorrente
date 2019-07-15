package slide11.parte2.ex1;


import java.util.concurrent.ConcurrentMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuchinski
 */
public class ContaLetras implements Runnable {
    ConcurrentMap<String, Integer> letras;
    String conteudo;

    public ContaLetras(ConcurrentMap<String, Integer> letras, String conteudo) {
        this.letras = letras;
        this.conteudo = conteudo;
    }

    @Override
    public void run() {
        for(char letra : this.conteudo.toCharArray()){
            if(this.letras.containsKey(Character.toString(letra))){
                this.letras.put(Character.toString(letra),this.letras.get(Character.toString(letra)) + 1);
            }
            else{
                this.letras.put(Character.toString(letra),1);
            }
        }
    }
    
    
    
}
