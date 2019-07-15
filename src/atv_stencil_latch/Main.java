/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_stencil_latch;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @author tuchinski
 */
public class Main {
    public static void main(String[] args) {
        double[] vetor = new double[]{1,2,2,1};
        CountDownLatch feito = new CountDownLatch(1);

        try{
            new Thread(new Stencil(vetor, 0, feito)).start();
            feito.await();
            System.out.println(Arrays.toString(vetor));
        }catch(InterruptedException e){}
            
        
    }
}
