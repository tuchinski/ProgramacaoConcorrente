/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_semaforos.ex3;

import java.util.concurrent.Semaphore;

/**
 *
 * @author a1792334
 */
public class mainEx2 {
    public static void main(String[] args) {
        Counter contador = new Counter();
        Semaphore semaforo = new Semaphore(1);
        
        Thread t1 = new IncrementsThread(semaforo, contador,"t1");
        Thread t2 = new IncrementsThread(semaforo, contador,"t2");
        
        t1.start();
        t2.start();
        
    }
}
