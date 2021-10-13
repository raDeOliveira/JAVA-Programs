package pt;
//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 04/12/2020
//Time: 18:37
//Course: Informatic Engineering

public class Node {

    private Node next; //next node
    private Student student; //object to student attributes

    public Node(Student student) { //constructor
        this.student = student;
    }

    //getters
    public Node getNext() {
        return next;
    }
    public Student getStudent() {
        return student;
    }

    //setters
    public void setNext(Node next) {
        this.next = next;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    public void showStudentAttributes() { //show student attributes
        System.out.print("(" + student.getStudentNumber() + ", " + student.getName() + ", " +
                student.getClassification() + ")");
    }
}
