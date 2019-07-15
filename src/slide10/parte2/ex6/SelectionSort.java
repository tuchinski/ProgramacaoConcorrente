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
public class SelectionSort implements Callable<String> {

    int[] vetor;

    public SelectionSort(int[] vetor) {
        this.vetor = vetor;
    }

    @Override
    public String call() {

        for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < vetor.length; i++) {
                if (vetor[i] < vetor[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = vetor[fixo];
                vetor[fixo] = vetor[menor];
                vetor[menor] = t;
            }
        }
        return "SelectionSort";
    }

}
