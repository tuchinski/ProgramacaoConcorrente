/*
 *Faça um programa em Java que inicie três threads e, cada
thread, espere um tempo aleat ́orio para terminar
 */



package Ativ2;

//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.util.Random;

/**
 *
 * @author a1792334
 */

class MyThread extends Thread{
    int value = 0;
            
    public MyThread(){
        Random aleatorio = new Random();
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
//        Thread t1 = new MyThread(1000);
//        Thread t2 = new MyThread(2000);
//        Thread t3 = new MyThread(3000);
        
        t1.start();
    }
}
