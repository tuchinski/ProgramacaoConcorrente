/*
 * Faça um programa usando Threads e ConcurrentMap para calcular a frequência de cada letra em um texto
 */
package slide11.parte2.ex1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
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
        try {
            int numThreads = 2;
            String arquivo = "/home/tuchinski/Documentos/UTFPR/Prog_Concorrente/teste.txt";
            int numLinha = 0;
            int linhasParaProcurar = 1;

            ConcurrentMap<String, Integer> letras = new ConcurrentHashMap<>();
            ExecutorService service = Executors.newFixedThreadPool(2);
            ArrayList<Future> future = new ArrayList<>();

            Scanner arq = new Scanner(new FileReader(arquivo));

            String conteudo = "";

            while (arq.hasNext()) {
                if(numLinha >= linhasParaProcurar){
                    ContaLetras c = new ContaLetras(letras,conteudo);
                    Future f = service.submit(c);
                    future.add(f);
                    
                    numLinha = 0;
                    conteudo = "";
                }
                conteudo = arq.nextLine();
                numLinha++;
            }
            
            
            for(Future ft : future){
                while(!ft.isDone()){
                    Thread.sleep(1000);
                }
            }
            
            for(String key : letras.keySet()){
                System.out.println(key+" "+letras.get(key));
            }
            
            service.shutdown();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Não encontrou o arq!");
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
