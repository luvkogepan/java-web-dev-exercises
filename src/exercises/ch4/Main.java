package exercises.ch4;

import exercises.ch4.Student;

public class Main {
    public static void main(String[] args) {
        Student michelle = new Student("Michelle", 1, 30, 4.0);
        michelle.setName("meesh");
        System.out.println(michelle.getGpa());
        System.out.println(michelle.getGradeLevel());
        michelle.addGrade(4,3.0);
        System.out.println(michelle.getGpa());
        System.out.println(michelle);
    }
}
