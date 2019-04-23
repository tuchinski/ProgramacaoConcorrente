/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide6a.ex2;

/**
 *
 * @author tuchinski
 */
public class ThreadSleepUntil extends Thread{
    private MonitorCounter monitor;
    private final int sleepUntilValue;

    public ThreadSleepUntil(MonitorCounter monitor, int value) {
        this.monitor = monitor;
        this.sleepUntilValue = value;
    }

    @Override
    public void run() {
        System.out.println("value = "+this.sleepUntilValue);
        monitor.sleepUntil(this.sleepUntilValue);
        System.out.println("Thread " +ThreadSleepUntil.currentThread().getName() + " acordada");
    }
    
    
}
