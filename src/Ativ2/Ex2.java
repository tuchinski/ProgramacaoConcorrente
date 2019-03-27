/*
 * Faça uma thread Java que realize a leitura de um arquivo
 * texto com frases e exiba as frases a cada 10 segundos.
 */
package Ativ2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tuchinski
 */
class MyThreadReadFile implements Runnable {

    private final String fileName;
    private final int time = 1000;
    ArrayList<String> phrases = new ArrayList<>(); //armazena as frases do arquivo

    public MyThreadReadFile(String fileName) {
        this.fileName = fileName;
        try {
            FileReader file = new FileReader(this.fileName);
            BufferedReader readFile = new BufferedReader(file);
            String phrase = readFile.readLine();

            while (phrase != null) {
                this.phrases.add(phrase);
                phrase = readFile.readLine();

            }
            file.close();
        } catch (FileNotFoundException ex) { //exceção caso a abertura do arquivo de errado
            System.out.println("File not found!");
        } catch (IOException ex) {//exceção caso a leitura do arquivo de errado
            System.out.println("IO Exception!");
        }

    }

    @Override
    public void run() {
        Random rnd = new Random();
        while (true) {
            int rndNum = rnd.nextInt(this.phrases.size());
            System.out.println(this.phrases.get(rndNum));
            try {
                Thread.sleep(this.time);
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
            } catch (InterruptedException ex) {
                System.out.println("MyThreadReadFile Interrupted!");
                return;
            }
        }
    }

}

public class Ex2 {

    public static void main(String[] args) {
        String fileName = "quotes.txt";
        Thread t1 = new Thread(new MyThreadReadFile(fileName));
        t1.start();

        
    }
}
