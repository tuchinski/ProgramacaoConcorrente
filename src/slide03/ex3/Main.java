/*. Faça um programa em Java com threads que exiba os
números primos entre 0 e 100000.*/
package slide03.ex3;

/**
 *
 * @author tuchinski
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int vet[] = new int[100000];
        
        for(int i=0;i<100000;i++){
            vet[i] = i+1;
        }
        
        Thread t1 = new isPrimo(vet, 0, 50000);
        Thread t2 = new isPrimo(vet, 50001, 99999);
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();

//        System.out.println("2%2!!!!!!!!!!!!!" + 2%2);
    }
}
