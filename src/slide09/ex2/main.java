/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide09.ex2;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author cogeti
 */
public class main {
    public static void main(String[] args) {
        ReentrantLock l = new ReentrantLock();
        SharedFifoQueue fila = new SharedFifoQueue(l, 10);
        
        Thread t1 = new ThreadConsome(fila);
        Thread t2 = new ThreadConsome(fila);
        Thread t3 = new ThreadInsere(fila);
        Thread t4 = new ThreadInsere(fila);
        
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
