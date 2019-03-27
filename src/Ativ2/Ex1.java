/*
 *Faça um programa em Java que inicie três threads e, cada
thread, espere um tempo aleat ́orio para terminar
 */



package Ativ2;

import java.util.Random;

/**
 *
 * @author a1792334
 */

class MyThread extends Thread{
    int value = 0;
            
    public MyThread(){
        Random aleatorio = new Random();
        this.value = 1000 + aleatorio.nextInt(2000-1000);
        
        
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(value);
        } catch (InterruptedException ex) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Thread finalized in " + value + " seconds");
    }
    
}

public class Ex1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }
        
    }
}
