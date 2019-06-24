/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide06a.ex2;

/**
 *
 * @author tuchinski
 */
public class mainEx2 {
    public static void main(String[] args) {
    MonitorCounter monitor = new MonitorCounter();
    
    ThreadIncrement t1  = new ThreadIncrement(monitor);
    ThreadSleepUntil t2 = new ThreadSleepUntil(monitor, 20000000);
    t2.setName("SleepUntil2");
    ThreadSleepUntil t3 = new ThreadSleepUntil(monitor, 10000000);
    t3.setName("SleepUntil3");
    
    t1.start();
    t2.start();
    t3.start();
    }
    
    
}
