package exercises.ch3;

import java.util.Arrays;

public class StringArrayPractice {
    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arr = sentence.split("\\.");
        //for (String a: arr) {
        //    System.out.println(a);
        //}
        System.out.println(Arrays.toString(arr));
    }
}
