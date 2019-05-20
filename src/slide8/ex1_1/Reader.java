/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide8.ex1_1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a1792334
 */
public class Reader extends Thread{
    ReaderWriter semaforo;

    public Reader(ReaderWriter semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        this.semaforo.startRead();
        System.out.println("Começando Leitura");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());
        }
        this.semaforo.endRead();
        System.out.println("Terminando  Leitura");
    }
    
    
}
