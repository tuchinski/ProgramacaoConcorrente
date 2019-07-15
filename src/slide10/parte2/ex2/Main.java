/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide10.parte2.ex2;

/**
 *
 * @author tuchinski
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        int count = 1;
        int numLinhas = 5;
        int numColunas = 5;

        int m[][] = new int[numLinhas][numColunas];
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                m[i][j] = count;
                count++;
            }
        }
        SomaMatriz sm = new SomaMatriz(m, numLinhas, numColunas, 3);
        System.out.println(sm.init());

    }
}
