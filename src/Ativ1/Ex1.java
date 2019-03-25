/*
*Implemente o exemplo anterior usando Lambda Expression
*
*/


package Ativ1;


/**
 *
 * @author a1792334
 */

public class Ex1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable task = () -> {
            System.out.println("Hello from a thread");
        };
        
        new Thread(task).start();
    }
    
}
