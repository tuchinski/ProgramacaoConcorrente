/**
 * . Faça um programa em Java para testar um conjunto de
 *  operações sobre um grupo de threads. Use o ThreadGroup
 */
package slide1.parte3.ex2;

/**
 *
 * @author tuchinski
 */
public class GrupoThreads {
        public static void main(String[] args) {
            ThreadGroup grupo = new ThreadGroup("grupo");
            
            Thread t1 = new Thread(grupo, "t1");
            Thread t2 = new Thread(grupo, "t2");
            Thread t3 = new Thread(grupo, "t3");
            
            System.out.println(grupo.toString());
    }
}
