/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.parte2.ex2;

import java.util.concurrent.Callable;

/**
 *
 * @author tuchinski
 */
public class SomaLinhaMatriz implements Callable<Integer>{
    int [] linha;

    public SomaLinhaMatriz(int[] linha) {
        this.linha = linha;
    }
    
    
    @Override
    public Integer call() throws Exception {
        int somador = 0;
        for(int valor: linha){
            somador +=valor;
        }
        return somador;
    }
    
    
}
