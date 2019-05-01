/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_semaforos.ex4;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1792334
 */
public class ThreadSleep extends Thread {

    private Semaphore semaforo;

    public ThreadSleep(Semaphore semaforo, String name) {
        super(name);
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        int count = 2;
        while (count > 0) {
            try {
                semaforo.acquire();
                System.out.println(Thread.currentThread().getName() + " executando");
                Thread.sleep(Math.round(Math.random() * 5000));
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSleep.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                semaforo.release();
                count--;
                System.out.println(Thread.currentThread().getName() + " finalizou");
            }
        }
    }

}
