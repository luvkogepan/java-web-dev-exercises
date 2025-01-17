package exercises.ch4;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    private void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGradeLevel() {
         String grade = "Freshman";
                if (numberOfCredits > 89) {
                    grade = "Senior";
                } else if (numberOfCredits > 59) {
                    grade = "Junior";
                } else if (numberOfCredits > 29) {
                    grade = "Sophmore";
                }
                return grade;
    }
    public void addGrade(int credits, double grade) {
        double currentPoints = this.gpa*this.numberOfCredits;
        double newPoints = credits*grade;
        this.numberOfCredits = numberOfCredits+credits;
        this.gpa = (currentPoints+newPoints)/numberOfCredits;
    }
    public String toString() {
        return "Student info: "+this.name+", "+ this.studentId+", "+this.numberOfCredits+", "+this.gpa;
    }
}
