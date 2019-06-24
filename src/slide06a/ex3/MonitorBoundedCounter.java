/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide06a.ex3;


/**
 *
 * @author tuchinski
 */
class MonitorBoundedCounter {
    private final int max;
    private final int min;
    private int valorAtual = 0;

    public MonitorBoundedCounter(int min, int max) {
        this.max = max;
        this.min = min;
    }
    
    public synchronized void increment(){
        while(this.valorAtual == this.max){
            try {
                this.wait();
            } catch (InterruptedException ex) {
                System.out.println("Exception increment" + ex);
            }
        }
        this.valorAtual++;
        System.out.println(this.valorAtual);
        this.notifyAll();
    }
    
    public synchronized void decrement(){
         while(this.valorAtual == this.min){
            try {
                this.wait();
            } catch (InterruptedException ex) {
                System.out.println("Exception increment" + ex);
            }
        }
        this.valorAtual--;
        System.out.println(this.valorAtual);
        this.notifyAll();
    }
    
}
