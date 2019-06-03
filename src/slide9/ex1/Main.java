/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide9.ex1;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author a1792334
 */
public class Main {
    public static void main(String[] args) {
        ReentrantLock l = new ReentrantLock();
        
        Counter c = new Counter(l);
        
        Thread t1 = new ThreadAdd(c);
        Thread t2 = new ThreadAdd(c);
        Thread t3 = new ThreadSub(c);
        
        t1.start();
        t3.start();
        t2.start();
        
    }
}
