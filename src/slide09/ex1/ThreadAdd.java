/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide09.ex1;

/**
 *
 * @author a1792334
 */
public class ThreadAdd extends Thread{
    
    Counter c;

    public ThreadAdd(Counter c) {
        this.c = c;
    }
    
    
    
    @Override
    public void run() {
       int count = 0;
       while(count < 1000){
           this.c.add();
           System.out.println("Valor ADD: " + this.c.getValue());
           count++;
       }
    }
    
}
