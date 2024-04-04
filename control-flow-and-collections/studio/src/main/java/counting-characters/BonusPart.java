import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class BonusPart {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = input.nextLine();

        char[] charactersInString = str.toUpperCase().toCharArray();
        System.out.println(charactersInString);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        HashMap<Character, Integer> characters = new HashMap<>();

        for(char i : charactersInString){
            System.out.println(i);
            if(alphabet.indexOf(i) >= 0) {
                if (characters.containsKey(i)) {
                    characters.put(i, characters.get(i) + 1);
                } else {
                    characters.put(i, 1);
                }
            }
        }

        System.out.println(characters);

        for(Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + ":" + character.getValue());
        }
        input.close();

    }
}
