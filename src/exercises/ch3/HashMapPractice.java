package exercises.ch3;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Double, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

       do {
           System.out.println("Student name: ");
           newStudent = input.nextLine();

           if (!newStudent.equals("")) {
               System.out.println("ID: ");
               Double ID = input.nextDouble();
               students.put(ID, newStudent);

               input.nextLine();
           }
       } while (!newStudent.equals(""));

       System.out.println("Class roster: ");
        for (Map.Entry<Double, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}
