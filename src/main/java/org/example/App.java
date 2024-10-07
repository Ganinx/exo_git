package org.example;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(wordsCount("As you walk on the way, the way appears"));
        System.out.println(reverser("hello"));
        System.out.println(palindromic("radar"));
    }



    public static int wordsCount(String word) {
        if (word == null || word.isEmpty()) {
            return 0;
        }
        String[] words = word.trim().split("\\s+");

        return words.length;
    }

    public static String reverser(String word) {
        if (word == null || word.isEmpty()) {
            return "Il n'y a pas de mot";
        }
        return new StringBuilder(word).reverse().toString();
    }

    public static boolean palindromic(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        return reverser(word).equals(word);
    }


}
