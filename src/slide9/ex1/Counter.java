/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide9.ex1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author a1792334
 */
public class Counter {
    private int counter = 0;
    ReentrantLock l;

    public Counter(ReentrantLock lock) {
        this.l = lock;
    }

    
    
    public void add(){
        l.lock();
        try {
            this.counter++;        
        } finally {
            l.unlock();
        }
    }
    
    public void sub(){
        l.lock();
        try {
            this.counter--;        
        } finally {
            l.unlock();
        }
    }
    
    public int getValue(){
        return this.counter;
    }
}
