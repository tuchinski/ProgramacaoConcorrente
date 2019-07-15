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
public class InsertionSort implements Callable<String> {

    int[] vetor;

    public InsertionSort(int[] vetor) {
        this.vetor = vetor;
    }

    @Override
    public String call() {

        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++) {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
        String s = "Insertion Sort";
        return s;
    }

}
