/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.parte2.ex3;

import java.util.concurrent.Callable;

/**
 *
 * @author tuchinski
 */
public class MultiplicaLinhaMatriz implements Callable<Integer>{
    int[] linha;
    int[] coluna;

    public MultiplicaLinhaMatriz(int[] linha, int[] coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    @Override
    public Integer call() throws Exception {
        int valor = 0;
        for(int i=0;i<this.linha.length;i++){
            valor += linha[i] * coluna[i];
        }
        return valor;
    }
    
    
}
