import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
     public  static  int sumEven(ArrayList<Integer> arr){
        int total = 0;
        for (int num : arr){
            if (num % 2 == 0){
                total += num;
            }
        }
        return total;
    }

    public  static void word(ArrayList<String> words){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length: ");
        int wordLength = input.nextInt();
        input.close();

        for ( String newWord : words){
            if(newWord.length() == wordLength) {
                System.out.println(newWord);
            }
            else{
                System.out.println("Please enter 5 letter words");
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(6);
        arrList.add(10);
        arrList.add(7);

//        ArrayList<String> wordList = new ArrayList<>();
//        wordList.add("Hi");
//        wordList.add("Hello");

            // Bonus
        String arr = "Hi,Hello,Love,snowy";
        String[] wordListNew = arr.split(",");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(wordListNew));


        System.out.println(sumEven(arrList));
        word(wordList);
    }
}
