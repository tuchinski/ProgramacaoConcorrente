/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.parte2.ex2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author tuchinski
 */
public class SomaMatriz {
    int [][] matriz;
    int numLinhas;
    int numColunas;
    int numThreads;
    
    public SomaMatriz(int[][] matriz, int numLinhas, int numColunas, int numThreads) {
        this.matriz = matriz;
        this.numLinhas = numLinhas;
        this.numColunas = numColunas;
        this.numThreads = numThreads;
    }
    
    int init() throws InterruptedException{
        
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        Set<Callable<Integer>> callables = new HashSet<>();
        for (int i = 0; i < numColunas; i++) {
            Callable soma = new SomaLinhaMatriz(matriz[i]);
            callables.add(soma);
        }

        List<Future<Integer>> futures = executor.invokeAll(callables);
        
        int soma = 0;
        
        for (Future<Integer> valorSoma : futures) {
            try {
                soma += valorSoma.get();
            } catch (ExecutionException ex) {}
        }
        executor.shutdown();
        return soma;
    }
    

        
}