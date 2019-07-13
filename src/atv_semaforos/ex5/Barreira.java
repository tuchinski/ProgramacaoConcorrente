/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_semaforos.ex5;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuchinski
 */
public class Barreira {

    Semaphore semaforo;
    Semaphore mutex;

    int numThreads;
    int tamBarreira;
    int maxThreads;


    public Barreira(int tamBarreira) {
        this.numThreads = 0;
        this.tamBarreira = tamBarreira;
        this.numThreads = 0;

        this.semaforo = new Semaphore(0);
        this.mutex = new Semaphore(1);
    }
    
    void incrementaBarreira(){
        try {
            this.mutex.acquire();
        } catch (InterruptedException ex) {}
        
        this.numThreads++;
        
        System.out.println("Num Threads: " + numThreads);
        
        if(numThreads>=tamBarreira){
            semaforo.release();
            System.out.println("libero!!!!!!");
        }
        
        try {
            System.out.println(semaforo.availablePermits());
            semaforo.acquire();
        } catch (InterruptedException e) {}
        
    }
}
