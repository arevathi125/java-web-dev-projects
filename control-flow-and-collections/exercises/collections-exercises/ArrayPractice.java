import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 8};
        // for loop
        for(int i=0; i < arr.length; i++){
        //   System.out.println(arr[i]);
            if ( arr[i] % 2 != 0){
              System.out.println(arr[i]);

        //For each loop
//          for(int i : arr){
//        //    System.out.println(i);
//
//            if ( i % 2 != 0){
//                System.out.println(i);
            }
        }

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] newWords = sentence.split("\\.");
        System.out.println(Arrays.toString(newWords));
    }

}
