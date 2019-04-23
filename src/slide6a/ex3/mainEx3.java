/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide6a.ex3;

/**
 *
 * @author tuchinski
 */
public class mainEx3 {

    public static void main(String[] args) {
        MonitorBoundedCounter monitor = new MonitorBoundedCounter(-10000, 10000);

        Runnable inc = () -> {
            while (true) {
                monitor.increment();
            }
        };

        Runnable dec = () -> {
            while (true) {
                monitor.decrement();
            }
        };
        
        new Thread(inc).start();
        new Thread(dec).start();
    }

}
