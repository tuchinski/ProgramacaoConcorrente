/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide08.ex1_3;

/**
 *
 * @author a1792334
 */
public class main {
    public static void main(String[] args) {
       ReaderWriter semaforo = new ReaderWriter();
       
       Reader r1 = new Reader(semaforo);
       Reader r2 = new Reader(semaforo);
       Reader r3 = new Reader(semaforo);
       Reader r4 = new Reader(semaforo);
       Writer w1 = new Writer(semaforo);
       
//       r1.start();
       w1.start();
       r2.start();
//       r3.start();
//       r4.start();
       
       
    }
}
