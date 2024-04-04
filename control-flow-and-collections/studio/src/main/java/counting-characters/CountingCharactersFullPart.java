import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CountingCharactersFullPart {

    public static char[] charsToArray(String str)  {
        return str.toCharArray();
    }

    public static HashMap<Character, Integer> countingCharacters(char[] strToChars) {
        HashMap<Character, Integer> characters = new HashMap<>();

        for (char c : strToChars) {
            if (Character.isLetter(c)) {
                char lowercaseChar = Character.toLowerCase(c);
                characters.put(lowercaseChar, characters.getOrDefault(lowercaseChar, 0) + 1);
            }
        }
        return characters;
    }

    public static void main(String[] args) {

        //Superbonus Part
        ResourceBundle bundle = ResourceBundle.getBundle("resources");
        String str = bundle.getString("str");
        char[] charArray = charsToArray(str);
        HashMap<Character, Integer> charactersMap = countingCharacters(charArray);
        //System.out.println(charactersMap);

        for(Map.Entry<Character, Integer> character : charactersMap.entrySet()) {
            System.out.println(character.getKey() + ":" + character.getValue());
        }

       /* //Bonus Part
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = input.nextLine();
        char[] charArray = charsToArray(str);
        HashMap<Character, Integer> charactersMap = countingCharacters(charArray);
        System.out.println(charactersMap);
        */


      /*  //First Part
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charArray = charsToArray(str);
        HashMap<Character, Integer> charactersMap = countingCharacters(charArray);
        System.out.println(charactersMap);
   */
    }
}
