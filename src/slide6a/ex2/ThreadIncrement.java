/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide6a.ex2;

/**
 *
 * @author tuchinski
 */
public class ThreadIncrement extends Thread {

    private MonitorCounter monitor;

    public ThreadIncrement(MonitorCounter monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        while (true) {
            monitor.increment();
        }
    }

}
