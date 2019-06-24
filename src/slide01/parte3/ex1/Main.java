/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide01.parte3.ex1;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1792334
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Thread> vetThread = new ArrayList<>();
        
        
        Thread t1 = new SimpleThread();
        Thread t2 = new SimpleThread();
        Thread t3 = new SimpleThread();
        Thread t4 = new SimpleThread();
        
        vetThread.add(t1);
        vetThread.add(t2);
        vetThread.add(t3);
        vetThread.add(t4);
        
        
        
        vetThread.forEach((t) -> {
            t.start();
        });
        
        MonitorThread monitor = new MonitorThread(vetThread);
        monitor.start();
        
        
        //interrompe uma thread a cada 2 seg
        Runnable task1 = () -> {
            for(Thread t : vetThread){
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException i){}
                t.interrupt();
            }
        };
        
        new Thread(task1).start();
    }
}
