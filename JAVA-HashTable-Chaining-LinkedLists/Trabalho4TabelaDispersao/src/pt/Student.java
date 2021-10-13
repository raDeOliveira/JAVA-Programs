package pt;
//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 04/12/2020
//Time: 18:29
//Course: Informatic Engineering

public class Student {

    private int studentNumber; //student attributes
    private String name;
    private double classification;
    private String courseName;

    public Student() { //constructor
        this.studentNumber = 0;
        this.name = "";
        this.classification = 0.0;
        this.courseName = "";
    }

    public Student(int studentNumber, String name, double classification, String courseName) { //constructor
        this.studentNumber = studentNumber;
        this.name = name;
        this.classification = classification;
        this.courseName = courseName;
    }

    //getters and setters
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
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

    @Override
    public String toString() { //toString method
        return "Student Number: " + studentNumber +
                "\nName: " + name +
                "\nClassification: " + classification +
                "\nCourse: " + courseName;
    }
}
