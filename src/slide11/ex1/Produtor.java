/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide11.ex1;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author a1792334
 */
public class Produtor implements Runnable {
    private final BlockingQueue fila;

    public Produtor(BlockingQueue queue) {
        this.fila = queue;
    }

    @Override
    public void run() {
        Random rnd = new Random();
        int count = 0;
        while(count < 3000000){
            int n = rnd.nextInt(100);
//            System.out.println("Add na fila: " + n);
            try {
                this.fila.put(n);
            } catch (InterruptedException ex) {}
            count++;
        }
    }
    
    
    
}
