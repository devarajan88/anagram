package com.deva.anagram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class AnagramGenerator {

    public static void main(String args[]) {

        HashSet<String> words = new HashSet();

        File file = new File("src/sample.txt");

        try {
            FileInputStream inputStream = new FileInputStream(file);
            Scanner scan = new Scanner(inputStream, "UTF-8");
            while (scan.hasNextLine()) {
                String word = scan.nextLine();
                words.add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String word : words) {
            System.out.println();
            char[] text = new char[word.length()];
            for (int i = 0; i < word.length(); i++) {
                text[i] = word.charAt(i);
            }
            generateAnagram(text, 0);
        }
    }

    static void generateAnagram(char[] ch, int i) {
        if (i == ch.length - 1) {
            System.out.print(ch);
            System.out.print("\t");
        } else {
            for (int j = i; j < ch.length; j++) {
                char c = ch[i];
                ch[i] = ch[j];
                ch[j] = c;
                generateAnagram(ch, i + 1);
                c = ch[i];
                ch[i] = ch[j];
                ch[j] = c;
            }
        }
    }
}
