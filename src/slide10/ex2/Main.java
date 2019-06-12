/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.ex2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author a1792334
 */
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        
        FatorialCallableTask f = new FatorialCallableTask(5);
        
        Future<Integer> future = executorService.submit(f);
        
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException ex) {
            System.out.println(ex);
        } 
        
        executorService.shutdown();
    }
}
