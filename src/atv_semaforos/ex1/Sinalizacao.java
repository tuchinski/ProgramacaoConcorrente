/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_semaforos.ex1;

import java.util.concurrent.Semaphore;

/**
 *
 * @author a1792334
 */
public class Sinalizacao {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(0);
        
        Thread t1 = new SimpleThread(5000,s,"t1");
        new Thread(new SimpleThreadRunnable(s)).start();
        t1.start();      
    }
}
