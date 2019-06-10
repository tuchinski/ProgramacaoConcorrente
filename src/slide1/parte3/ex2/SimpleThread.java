/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide1.parte3.ex2;

import java.util.Random;

/**
 *
 * @author tuchinski
 */
public class SimpleThread extends Thread {

    private final int minTime = 1000;
    private final int maxTime = 5000;

    @Override
    public void run() {

        Random rnd = new Random();
        while (true) {
            System.out.println("Thread " + Thread.currentThread().getName() + " rodando!!");
            if (Thread.interrupted()) {
                System.out.println("Thread " + Thread.currentThread().getName() + " finalizada!!");
                break;
            }
            try {
                Thread.sleep(this.minTime + rnd.nextInt(this.maxTime - this.minTime));
            } catch (InterruptedException ex) {
            }

        }
    }

}
