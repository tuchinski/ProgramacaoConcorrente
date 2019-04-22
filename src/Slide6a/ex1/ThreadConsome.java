/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide6a.ex1;

/**
 *
 * @author a1792334
 */
public class ThreadConsome extends Thread {

    private MonitorBufferCircular monitor;

    public ThreadConsome(MonitorBufferCircular monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        System.out.println("consome");
        while (true) {
            System.out.println("Numero Consumido: " + this.monitor.consome());
        }
    }

}
