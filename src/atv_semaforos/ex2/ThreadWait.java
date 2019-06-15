/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_semaforos.ex2;

/**
 *
 * @author tuchinski
 */
public class ThreadWait extends Thread{
    private int counter;

    public ThreadWait(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("Startando Thread" + Thread.currentThread().getName());
        
        try{
            Thread.sleep(this.counter);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
        System.out.println("Finalizando Thread" + Thread.currentThread().getName());
    }
    
    
}
