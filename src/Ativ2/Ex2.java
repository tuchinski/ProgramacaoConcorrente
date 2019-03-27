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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

/**
 *
 * @author tuchinski
 */
class MyThreadRunnable implements Runnable {

    private final String fileName;
    ArrayList<String> phrases = new ArrayList<>();

    public MyThreadRunnable(String fileName) {
        this.fileName = fileName;
        try {
            FileReader file = new FileReader(this.fileName);
            BufferedReader readFile = new BufferedReader(file);
            String phrase = readFile.readLine();

            while (phrase != null) {
//                System.out.println(phrase);
                this.phrases.add(phrase);
                phrase = readFile.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        } catch (IOException ex) {
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
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                System.out.println("Thread Interrupted!");
            }
        }
    }

}

public class Ex2 {

    public static void main(String[] args) {
        String fileName = "/home/tuchinski/Documentos/UTFPR/Prog_Concorrente/quotes.txt";
        new Thread(new MyThreadRunnable(fileName)).start();
    }

}
