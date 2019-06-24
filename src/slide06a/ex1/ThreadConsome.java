/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide06a.ex1;

/**
 *
 * @author a1792334
 */
public class ThreadConsome extends Thread {

    private MonitorBufferCircular monitor;

    public ThreadConsome(MonitorBufferCircular monitor) {
        this.monitor = monitor;
        ThreadConsome.currentThread().setName("Consome1");
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Numero Consumido: " + this.monitor.consome());
        }
    }

}
