package exercises.ch3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double wordNum;
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(sentence.split(" ")));

        /*words.add("apple");
        words.add("orange");
        words.add("five");
        words.add("court");
        words.add("snooze");
        words.add("rain");
        words.add("tribe");
        words.add("start");
*/
        System.out.println("Choose word length to return: ");
        wordNum = input.nextDouble();
        input.close();
        for (String word : words) {
            if (word.length()==wordNum)
            System.out.println(word);
        }
    }
}

