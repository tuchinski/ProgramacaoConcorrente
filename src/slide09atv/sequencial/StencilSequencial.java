/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide09atv.sequencial;

import java.util.Arrays;

/**
 *
 * @author a1792334
 */
public class StencilSequencial {

    public static void calc(double v1[], double v2[]) {
        v2[0] = v1[0];
        v2[v1.length-1] = v1[v1.length-1];
        for (int i = 1; i < v1.length - 1; i++) {
            v2[i] = (v1[i - 1] + v1[i + 1]) / 2;
        }
    }

    public static void main(String[] args) {
        double[] vet1 = {1,2,2,1};
        double[] vet2 = {0,0,0,0};


        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                calc(vet1, vet2);
            System.out.println(Arrays.toString(vet2));
            } else {
                calc(vet2, vet1);
                System.out.println(Arrays.toString(vet1));
            }
        }
        
    }

}
