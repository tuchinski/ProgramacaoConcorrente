/*
 * Faça um programa que receba um valor indicando um n ́umero
 * de threads a serem instanciadas e teste os dois modos de criar
 * threads em Java. 
 */
package slide01.parte1.ex2;
import java.util.Scanner;
        

/**
 *
 * @author a1792334
 */

 class HelloThread implements Runnable{

        @Override
        public void run() {
            System.out.println("Thread criada com Runnable");
        }
        
    }

public class ThreadRunnable {
   
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int qtdeThreads = s.nextInt();
        
        
        for(int i=0;i<qtdeThreads;i++){
            new Thread(new HelloThread()).start();
        }
        
    }
}
