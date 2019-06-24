/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide01.parte2.ex1;

import java.util.Random;

/**
 *
 * @author a1792334
 */
public class MyThreadRdn extends Thread{
    private int value = 0;
    private int id = -1;
    private final int minTime = 1000;
    private final int maxTime = 2000;
   
     public MyThreadRdn(){
        Random aleatorio = new Random();
        this.value = this.minTime + aleatorio.nextInt(this.maxTime-this.minTime); 
    }
     
    public MyThreadRdn(int id){
        Random aleatorio = new Random();
        this.id = id;
        this.value = this.minTime + aleatorio.nextInt(this.maxTime-this.minTime); 
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(value);
            
            if(Thread.interrupted()){
                throw new InterruptedException();
            }
        } catch (InterruptedException ex) {
//            System.out.println("MyThreadRdn " +this.id + " interrupted");
            return;
        }
        System.out.println("Thread " + this.id + " finalized in " + value + " seconds");
    }
}