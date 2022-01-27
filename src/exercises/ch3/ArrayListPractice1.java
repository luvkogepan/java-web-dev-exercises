package exercises.ch3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Double newNum;
        Double sumNums = 0.0;

        System.out.println("Enter 10 numbers: ");

        do {
            newNum = input.nextDouble();
            nums.add(newNum);
            sumNums+=newNum;

        } while (nums.size() <10);

        System.out.println("The sum of your numbers are "+ sumNums);
    }
}
