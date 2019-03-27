/*
 *Faça um programa em Java que inicie três threads e, cada
thread, espere um tempo aleat ́orio para terminar
 */



package Ativ2;

import java.util.Random;

/**
 *
 * @author tuchinski
 */

class MyThreadRdn extends Thread{
    int value = 0;
    int id = -1;
   
     public MyThreadRdn(){
        Random aleatorio = new Random();
        this.value = 1000 + aleatorio.nextInt(2000-1000); 
    }
     
    public MyThreadRdn(int id){
        Random aleatorio = new Random();
        this.id = id;
        this.value = 1000 + aleatorio.nextInt(2000-1000); 
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(value);
            
            if(Thread.interrupted()){
                throw new InterruptedException();
            }
        } catch (InterruptedException ex) {
            System.out.println("MyThreadRdn interrupted");
            return;
        }
        System.out.println("Thread " + this.id + " finalized in " + value + " seconds");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        int numThreads = 10;
        for (int i = 0; i < numThreads; i++) {
            new MyThreadRdn(i).start();
        }
        
    }
}
