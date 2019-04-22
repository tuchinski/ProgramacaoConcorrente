/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide6a.ex1;

/**
 *
 * @author a1792334
 */
public class mainEx1 {

    public static void main(String[] args) {
        MonitorBufferCircular monitor = new MonitorBufferCircular();
        ThreadConsome c1 = new ThreadConsome(monitor);
        ThreadConsome c2 = new ThreadConsome(monitor);

        ThreadInsere i1 = new ThreadInsere(monitor);
        ThreadInsere i2 = new ThreadInsere(monitor);
        
        i1.start();
        i2.start();
        c1.start();
        c2.start();
    }

}
