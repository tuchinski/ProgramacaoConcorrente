/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide1.parte2.ex4;

import java.util.ArrayList;

/**
 *
 * @author a1792334
 */
public class MonitorThread extends Thread{
    ArrayList<Thread> vetThread; 

    public MonitorThread(ArrayList<Thread> vetThread) {
        this.vetThread = vetThread;
    }
    
  

    @Override
    public void run() {
        while(true){
            for (Thread t : this.vetThread) {
                if(!t.isAlive()){ 
                    System.out.println("Thread "+t.getName() + " interrompida");
                }else{
                    System.out.println("Thread "+t.getName() + " rodando");
                }
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
        }
    }
    
    
    
    
}
