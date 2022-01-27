package exercises.ch2;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Hello, what is your name: ");
        String name= input.nextLine();
        System.out.println("Hello " + name);
        String msg = "Hello World";

        for (char c : msg.toCharArray()) {
            System.out.println(c);
        }
    }
}
