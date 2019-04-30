/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_semaforos.ex3;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1792334
 */
public class IncrementsThread extends Thread{

    private Semaphore semaforo;
    private Counter contador;

    public IncrementsThread(Semaphore semaforo, Counter contador) {
        this.semaforo = semaforo;
        this.contador = contador;
    }

    public IncrementsThread(Semaphore semaforo, Counter contador, String name) {
        super(name);
        this.semaforo = semaforo;
        this.contador = contador;
    }

    
    
    @Override
    public void run() {
        while(true){
            try {
                this.semaforo.acquire();
//                System.out.println(Thread.currentThread().getName());
                System.out.println(this.contador.increments());
            } catch (InterruptedException ex) {
                Logger.getLogger(IncrementsThread.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                this.semaforo.release();
            }
        }
    }
    
}
