/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.parte2.ex1;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author tuchinski
 */
public class Main {

    public static void main(String[] args) {
        int tam = 20;
        int[] vetor = new int[tam];
        for (int i = 0; i < tam; i++) {
            vetor[i] = i;
        }
//        EncontraMaiorVetor v = new EncontraMaiorVetor(20, 2, vetor);
//        v.divideVetor();

        encontraMaior(10, 2, vetor);
    }

    public static void encontraMaior(int numTarefas, int numThreads, int[] vetor) {
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        if (numTarefas > vetor.length) {
            System.out.println("NUMERO DE TAREFAS MAIOR QUE O TAMANHO DO VETOR");
            return;
        }

        int numElementos = vetor.length / numTarefas;

        int posI = 0;
        int i;
        for (i = 0; i < numTarefas - 1; i++) {
            System.out.println((i + 1) + ": (" + posI + "," + (posI + numElementos - 1) + ")");
//            System.out.println(Arrays.toString(Arrays.copyOfRange(vetor, posI, (posI + numElementos-1))));
            posI = posI + numElementos;
        }

        System.out.println((i + 1) + ": (" + posI + "," + (vetor.length - 1) + ")");
    }

}
