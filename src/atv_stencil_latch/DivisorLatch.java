/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv_stencil_latch;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author tuchinski
 */
public class DivisorLatch implements Runnable {

    int pos;
    double[] vetor;
    CountDownLatch sinalPronto;

    public DivisorLatch(int pos, double[] vetor, CountDownLatch sinalFeito) {
        this.pos = pos;
        this.vetor = vetor;
        this.sinalPronto = sinalFeito;
    }

    @Override
    public void run() {
        if((pos != 0) && pos != (vetor.length - 1)){
            double v = ((vetor[pos-1] + vetor[pos+1])/2);
            vetor[pos] = v;
        }
        sinalPronto.countDown();
    }
    
    
}
