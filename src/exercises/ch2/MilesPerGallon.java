package exercises.ch2;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double mpg;

        Scanner input= new Scanner(System.in);
        System.out.println("How many miles driven: ");
        miles= input.nextDouble();
        System.out.println("How many gallons of gas used: ");
        gallons= input.nextDouble();
        input.close();

        mpg= miles/gallons;
        System.out.println("You use " + mpg + " miles per gallon.");
    }
}
