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
public class SimpleThread extends Thread{
    private final int timeSleep;
    private final Semaphore semaforo;

    public SimpleThread(int timeSleep, Semaphore semaforo) {
        this.timeSleep = timeSleep;
        this.semaforo = semaforo;
    }

    public SimpleThread(int timeSleep, Semaphore semaforo, String name) {
        super(name);
        this.timeSleep = timeSleep;
        this.semaforo = semaforo;
    }
    


    @Override
    public void run() {
        try {
            System.out.println("Iniciando Thread " + SimpleThread.currentThread().getName());
            Thread.sleep(this.timeSleep);
        } catch (InterruptedException ex) {
            Logger.getLogger(SimpleThread.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.semaforo.release();
            System.out.println("Finalizando Thread " + SimpleThread.currentThread().getName()); 
        }
    }   
}
