package pt;
//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 24/11/2020
//Time: 18:14
//Course: Informatic Engineering

public class Student {

    private String studentNumber;
    private String name;
    private double classification;
    private String courseName;

    public Student() {
        this.studentNumber = "";
        this.name = "";
        this.classification = 0.0;
        this.courseName = "";
    }

    public Student(String studentNumber, String name, double classification, String courseName) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.classification = classification;
        this.courseName = courseName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getClassification() {
        return classification;
    }

    public void setClassification(double classification) {
        this.classification = classification;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void print() {
        System.out.println(studentNumber + ", " + name + ", " + classification);
    }
}
