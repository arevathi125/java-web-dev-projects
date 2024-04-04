import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SuperBonusPart {
    public static void main(String[] args) {
        String str = "";

        try{
            File file = new File("control-flow-and-collections/studio/src/main/java/counting-characters/string");
           // String file = "counting-characters/string.txt";
            Scanner input = new Scanner(file);
           //  Content Root
            //  Scanner input = new Scanner(new File("control-flow-and-collections/studio/src/main/java/counting-characters/string"));
            // Absolute Path
          //  Scanner input = new Scanner(new File("C:/Users/areva/Desktop/java-web-dev-projects/control-flow-and-collections/studio/src/main/java/counting-characters/string"));
            if(input.hasNextLine()){
                str = input.nextLine();
            }
            input.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        char[] charactersInString = str.toUpperCase().toCharArray();
        System.out.println(charactersInString);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        HashMap<Character, Integer> characters = new HashMap<>();

        for(char i : charactersInString){
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
    }
}
