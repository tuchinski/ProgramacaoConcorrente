/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide6a.ex1;

import java.util.Random;

/**
 *
 * @author a1792334
 */
public class ThreadInsere extends Thread {

    private MonitorBufferCircular monitor;

    public ThreadInsere(MonitorBufferCircular monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        System.out.println("insere");
        while (true) {
            Random rnd = new Random();
            int numAleatorio = rnd.nextInt();
            this.monitor.insere(numAleatorio);
        }
    }

}
