package org.launchcode;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
       System.out.println("Enter the word to search : ");
        String word = input.next();
        input.close();
        String sentence1 = sentence.toLowerCase();

        //D.
         System.out.println(sentence1.contains(word));

         // E.
         int index = sentence1.indexOf((word));
         int length = word.length();
        System.out.println("Index of the word is "+index+". Your word length is "+length);
         String newSentence = sentence1.replace(word,"");
         System.out.println((newSentence));
    }
}
