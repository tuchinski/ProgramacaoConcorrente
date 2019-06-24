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
class MonitorCounter {
    
    private int valueIncrements; // valor que vai ser incrementado

    public MonitorCounter() {
        this.valueIncrements = 0;
    }
    
    public synchronized void increment(){
        this.valueIncrements++;

        this.notifyAll();
    }
    
    public synchronized void sleepUntil(int x){
        while(this.valueIncrements<x){
            try {
                this.wait();
            } catch (InterruptedException ex) {
                System.out.println("interrupção sleepUntil " + ex);
            }
        }
        this.notifyAll();
        System.out.println("sai");
    }
    
}
