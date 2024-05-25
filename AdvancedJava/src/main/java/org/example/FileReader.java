package org.example;

import javax.swing.*;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {


    public static void main(String[] args) throws IOException {
    File file;
    {
        file = new File("ample.txt");

    }
     InputStream fileInputStream;

    {
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            int available = fileInputStream.available();
            System.out.println(available);
            byte[] content = new byte[100] ;
            fileInputStream.read(content);
            String fileContent = new String(content) ;
            System.out.println(fileContent);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally{
            fileInputStream.close();
        }
    }

    }

}
