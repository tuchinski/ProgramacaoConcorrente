/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.parte2.ex1;

import java.util.concurrent.Callable;

/**
 *
 * @author tuchinski
 */
public class EncontraMaiorSegVetor implements Callable<Integer>{
    int inicio;
    int fim;
    int[] vetor;

    public EncontraMaiorSegVetor(int inicio, int fim, int[] vetor) {
        this.inicio = inicio;
        this.fim = fim;
        this.vetor = vetor;
    }

    @Override
    public Integer call() throws Exception {
        int maior = Integer.MIN_VALUE;
        for(int i = this.inicio;i<=this.fim;i++){
            if(this.vetor[i] > maior){
                maior = this.vetor[i];
            }
        }
        return maior;
    }
    
    
}
