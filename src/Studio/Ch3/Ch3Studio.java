package Studio.Ch3;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Ch3Studio {
    public static void main(String[] args) {
        //String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";
        Scanner input = new Scanner(System.in);


        System.out.println("Input a quote: ");
        String quote = input.nextLine().toLowerCase();
        char[] arr = quote.toLowerCase().toCharArray();
        HashMap<Character, Integer> myHashmap = new HashMap<>();

        // LOOP the array
        for (Character letter : arr) {
            if (!myHashmap.containsKey(letter)) {
                myHashmap.put(letter, 1);
            } else {
                myHashmap.put(letter, myHashmap.get(letter) + 1);
            }
        }



        for (Map.Entry<Character, Integer> element : myHashmap.entrySet()) {
            System.out.println(element.getKey() + ": " + element.getValue());
        }
    }
}

