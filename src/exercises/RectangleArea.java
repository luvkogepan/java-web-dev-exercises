package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        double length;
        double width;
        double area;

        Scanner input= new Scanner(System.in);
        System.out.println("length: ");
        length= input.nextDouble();
        System.out.println("Width: ");
        width= input.nextDouble();
        input.close();

        area= length*width;
        System.out.println("The are of your rectangle is " + area + ".5");
    }
}