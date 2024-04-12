import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class BonusPart {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = input.nextLine();

        String replaceNumAlpha = str.replaceAll("[^a-zA-Z]","");
        //System.out.println(replaceNumAlpha);
        char[] charactersInString = replaceNumAlpha.toUpperCase().toCharArray();
        //System.out.println(charactersInString);

       // String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        HashMap<Character, Integer> characters = new HashMap<>();

        for(char c : charactersInString){
           // System.out.println(c);
       //    if(alphabet.indexOf(c) >= 0) {
            if (characters.containsKey(c)) {
                    characters.put(c, characters.get(c) + 1);
                } else {
                    characters.put(c, 1);
                }
            }
      //  }

       // System.out.println(characters);

        for(Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + ":" + character.getValue());
        }
        input.close();
    }
}
