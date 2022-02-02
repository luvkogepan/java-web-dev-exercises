package exercises.ch4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Course {
    private String title;
    private Teacher instructor;
    private int credits = 4;
    private ArrayList<String> students;

    public Course(String title, Teacher instructor, int credits) {
        this.title = title;
        this.instructor = instructor;
        this.credits = credits;
        this.students = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return title.equals(course.title) && instructor.equals(course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, instructor);
    }
}
