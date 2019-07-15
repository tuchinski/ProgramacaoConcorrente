/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.parte2.ex6;

import java.util.concurrent.Callable;

/**
 *
 * @author tuchinski
 */
public class BubbleSort implements Callable<String> {

    int[] vetor;

    public BubbleSort(int[] vetor) {
        this.vetor = vetor;
    }

    @Override
    public String call() {
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
        return "BubbleSort";
    }
}
