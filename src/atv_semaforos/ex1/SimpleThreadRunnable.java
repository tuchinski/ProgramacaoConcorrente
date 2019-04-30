/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_semaforos.ex1;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1792334
 */
public class SimpleThreadRunnable implements Runnable{

    private Semaphore s;

    public SimpleThreadRunnable(Semaphore s) {
        this.s = s;
    }
    
    
    @Override
    public void run() {
        try {
            System.out.println("Thread Runnable Iniciada");
            s.acquire();
            System.out.println("Thread Runnable Finalizada");
        } catch (InterruptedException ex) {
            Logger.getLogger(SimpleThreadRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            s.release();
        }
    }
    
}
