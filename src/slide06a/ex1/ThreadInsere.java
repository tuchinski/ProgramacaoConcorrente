/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide06a.ex1;

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
        while (true) {
            Random rnd = new Random();
            int numAleatorio = rnd.nextInt(100);
            System.out.println("Inserindo Valor-> " + numAleatorio);
            this.monitor.insere(numAleatorio);
        }
    }

}
