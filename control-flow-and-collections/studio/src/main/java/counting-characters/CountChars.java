import java.util.HashMap;
import java.util.Map;

public class CountChars {

    public static void main(String[] args) {

        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = str.toCharArray();
        System.out.println(charactersInString);

        HashMap<Character, Integer> characters = new HashMap<>();

        for(char i : charactersInString){
            if(characters.containsKey(i)){
                characters.put(i,characters.get(i) + 1);
            }
            else{
                characters.put(i, 1);
            }
        }

        for(Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + ":" + character.getValue());
        }

    }
}
