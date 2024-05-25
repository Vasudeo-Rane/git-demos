package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReaderDemo {
    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\vasur\\OneDrive\\Desktop\\shell_script_tutorial.txt"));
        try {
            String data = bufferedReader.readLine();
            System.out.println("The first line" + data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
