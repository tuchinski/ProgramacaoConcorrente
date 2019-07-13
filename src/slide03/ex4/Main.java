/*4. Faça um programa em Java que realize uma busca paralela
em um vetor de inteiros. Informe para o método: valor procurado,
vetor de inteiros e o número de threads.
*/
package slide03.ex4;

/**
 *
 * @author tuchinski
 */
public class Main {
    public static void main(String[] args) {
        int tam = 100;
        int vet[] = new int[tam];
        
        for(int i=0;i<tam;i++){
            vet[i] = i;
        }
        
        ProcuraVetorThread p = new ProcuraVetorThread(99, vet, 1);
        p.inicBusca();
        
    }
}
