/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide01.parte3.ex1;

/**
 *
 * @author a1792334
 */
public class SimpleThread extends Thread{

    @Override
    public void run() {
        while(!Thread.interrupted()){
//            System.out.println("Thread " + Thread.currentThread().getName() +  " em execução");
        }
        System.out.println("THREAD " +Thread.currentThread().getName() + " finalizada");
    }
    
}
