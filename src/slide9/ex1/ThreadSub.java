/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide9.ex1;

/**
 *
 * @author a1792334
 */
public class ThreadSub extends Thread{
    Counter c;

    public ThreadSub(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {
        int count = 0;
        while(count < 1000){
            this.c.sub();
            System.out.println("Valor SUB: " + this.c.getValue());
            count++;
        }
    }
    
    
    
}
