package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int wc = 0;

        System.out.println("Please! Enter your file path as a windows path");
        Scanner scanner =new Scanner(System.in);
        String userInput = scanner.next();
        String pathWin = userInput.replace("\\" ,"/");

        File path = new File(pathWin);

        try  {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String word;
            while ((word = reader.readLine()) != null) {
                String[] words = word.split(" ");
                wc += words.length;
            }
        } catch (IOException e) {
            System.out.println("The system could not find the path specified :" + e.getMessage());
        }

        System.out.println("Sum of word count :" + wc);
    }
}