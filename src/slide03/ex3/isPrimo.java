/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide03.ex3;

/**
 *
 * @author tuchinski
 */
public class isPrimo extends Thread {

    int[] valores;
    int max;
    int min;

    public isPrimo(int[] valores, int min, int max) {
        this.valores = valores;
        this.max = max;
        this.min = min;
    }

    @Override
    public void run() {
        int divisores = 0;
        for (int i = valores[min]; i <= valores[max]; i++) {
            //System.out.println("-----------------");
            divisores = 0;
            for (int j = 1; j < i; j++) {
            //System.out.println("I: " + i);
            //System.out.print("j: " + j + "\n");
                if (i % j == 0) {
                    divisores++;
//                    System.out.println("dividiu " + divisores);
                }
                if(divisores > 1){
                    break;
                }
            }
            if(valores[min] == 3){
                System.out.println("asdfsasdfs: " + divisores);
            }
            if (divisores == 1 ) {
                System.out.println("O número " + i + " é primo!!!!");
            }
        }
    }

}
