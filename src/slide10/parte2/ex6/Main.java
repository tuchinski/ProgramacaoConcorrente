/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.parte2.ex6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuchinski
 */
public class Main {
    public static void main(String[] args) {
        int tamVet = 100;
        int [] vetor1 = new int [tamVet];
        int [] vetor2 ;
        int [] vetor3 ;
        
        
        for(int i=0;i<tamVet;i++){
            vetor1[i] = tamVet - i;
        }
        vetor2 = Arrays.copyOf(vetor1, tamVet);
        vetor3 = Arrays.copyOf(vetor1, tamVet);
        
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        
        Set<Callable<String>> callable = new HashSet<>();
        
        callable.add(new InsertionSort(vetor1));
        callable.add(new BubbleSort(vetor2));
        callable.add(new SelectionSort(vetor3));
        
        try {
            String result = executor.invokeAny(callable);
            System.out.println(result);
        } catch (InterruptedException | ExecutionException ex) {}
        
        executor.shutdown();
        
    }
}
