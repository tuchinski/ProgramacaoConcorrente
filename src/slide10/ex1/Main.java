/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.ex1;

import java.util.logging.Level;
import java.util.logging.Logger;
import slide10.ex2.ResultadoClass;

/**
 *
 * @author a1792334
 */
public class Main {

    public static void main(String[] args) {
        
        ResultadoClass n = new ResultadoClass();
        
        Thread t1 = new Thread(new FatorialRunnableTask(5,n));
        
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
        System.out.println(n.getValor());

    }
}
