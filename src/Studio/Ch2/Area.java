package Studio.Ch2;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double area;
        double radius;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius= input.nextDouble();
        input.close();

        area= Circle.getArea(radius);
        System.out.println("The area of a circle of radius "+ radius + " is: "+ area);
    }
}
