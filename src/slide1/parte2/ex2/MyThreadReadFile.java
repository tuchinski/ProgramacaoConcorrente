/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide1.parte2.ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author a1792334
 */

public class MyThreadReadFile implements Runnable {

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
