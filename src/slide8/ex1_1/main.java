/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide8.ex1_1;

/**
 *
 * @author a1792334
 */
public class main {
    public static void main(String[] args) {
        ReaderWriter sem = new ReaderWriter();
        
        Reader r1 = new Reader(sem);
        Reader r2 = new Reader(sem);
        Reader r3 = new Reader(sem);
        Reader r4 = new Reader(sem);
        Reader r5 = new Reader(sem);
        Writer w1 = new Writer(sem);
        
        r1.start();
        r2.start();
        w1.start();
        r3.start();
        r4.start();
        r5.start();
        
    }
}
