/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide07.ex1;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1792334
 */
public class BufferSemaforo {
    private int num;
    private boolean isFull;
    
    private final Semaphore semaforo;

    public BufferSemaforo(Semaphore semaforo) {
        this.semaforo = semaforo;
    }

    
    
    
    public synchronized int consomeBuffer(){
        while(!this.isFull){
            try {
                semaforo.acquire();
                this.isFull = false;
            } catch (InterruptedException ex) {
                Logger.getLogger(BufferSemaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.num;
    }
    
    
}
