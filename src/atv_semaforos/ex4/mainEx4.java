/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_semaforos.ex4;

import java.util.concurrent.Semaphore;

/**
 *
 * @author a1792334
 */
public class mainEx4 {
    public static void main(String[] args) {
        Semaphore semaforo = new Semaphore(2);

        Thread t1 = new ThreadSleep(semaforo, "t1");
        Thread t2 = new ThreadSleep(semaforo, "t2");
        Thread t3 = new ThreadSleep(semaforo, "t3");
        Thread t4 = new ThreadSleep(semaforo, "t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
    
    
    
    
}
