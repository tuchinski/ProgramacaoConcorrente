/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide8.ex1_3;

/**
 *
 * @author a1792334
 */
public class Writer extends Thread{
    ReaderWriter semaforo;

    public Writer(ReaderWriter semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        this.semaforo.startWrite();
        System.out.println("Começando escrita!");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {}
        this.semaforo.endWrite();
        System.out.println("Terminando escrita");
    }
    
}
