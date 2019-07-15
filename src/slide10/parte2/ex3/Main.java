/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.parte2.ex3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuchinski
 */
public class Main {

    public static void main(String[] args) {
        int linha1 = 2;
        int col1 = 2;
        int linha2 = 2;
        int col2 = 2;

        int m1[][] = new int[linha1][col1];
        int m2[][] = new int[linha2][col2];

        int count = 1;
        for (int i = 0; i < linha1; i++) {
            for (int j = 0; j < col1; j++) {
                m1[i][j] = count;
                count++;
            }
        }

        for (int i = 0; i < linha2; i++) {
            for (int j = 0; j < col2; j++) {
                m2[i][j] = count;
                count++;
            }
        }

        if (col1 != linha2) {
            System.out.println("Não é possivel realizar a Multiplicação");
        }
        int[][] newM = new int[linha1][col2];

        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 0; i < linha1; i++) {
            for (int j = 0; j < col2; j++) {
                Future future = executor.submit(new MultiplicaLinhaMatriz(m1[i], m2[j]));
                try {
                    newM[i][j] = (int) future.get();
                } 
                catch (InterruptedException | ExecutionException ex) {}
            }
        }
        for(int i=0;i<linha1;i++){
            for(int j=0;j<col2;j++){
                System.out.println("M["+i+"]["+j+"] = " + newM[i][j]);
            }
        }
    }
}
