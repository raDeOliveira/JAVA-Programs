package pt;
//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 04/12/2020
//Time: 18:12
//Course: Informatic Engineering

import java.util.Arrays;

public class Main {

    //separator
    public static void separator(){
        char x = '=';
        char [] separator = new char[30];
        Arrays.fill(separator, x);
        System.out.println(separator);
    }

    public static void main(String[] args) {

        HashList table = new HashList(40); //object with hash list size
        Student s = new Student(); //object for student attributes
        int option;

        System.out.println();
        System.out.println("===========================================");
        System.out.println("********** ISPGaya Students list **********");
        System.out.println("===========================================");
        System.out.println();
        do {
            System.out.println("1 - Insert");
            System.out.println("2 - Search");
            System.out.println("3 - Delete");
            System.out.println("4 - View students list");
            System.out.println("5 - Count students");
            System.out.println("9 - Exit");
            option = Read.oneInt();

            switch (option) {
                case 1:
//                    System.out.println("Insert identification number: "); //insert number but ONLY LAST 6 digits will be stored
//                    s.setStudentNumber(Read.oneInt());
//                    System.out.println("Insert name: "); //insert name
//                    s.setName(Read.oneString());
//                    System.out.println("Insert classification: "); //insert classification
//                    s.setClassification(Read.oneDouble());
//                    System.out.println("Insert course name: "); //insert course
//                    s.setCourseName(Read.oneString());
//                    table.insertKey(new Node(new Student(s.getStudentNumber(), s.getName(), s.getClassification(), s.getCourseName())));

                    //COMMENT lines above
                    //and
                    //UNCOMMENT lines bellow
                    //to test program faster
                    //

                    s.setStudentNumber(2020100444);
                    s.setName("Darwin Nunez");
                    s.setClassification(15);
                    s.setCourseName("E.Informatica");
                    table.insertKey(new Node(new Student(s.getStudentNumber(), s.getName(), s.getClassification(), s.getCourseName())));
                    s.setStudentNumber(2111700444);
                    s.setName("Macacos Salgados");
                    s.setClassification(14);
                    s.setCourseName("E.Mecanica");
                    table.insertKey(new Node(new Student(s.getStudentNumber(), s.getName(), s.getClassification(), s.getCourseName())));
                    s.setStudentNumber(2020100013);
                    s.setName("Barbie Blondie");
                    s.setClassification(6);
                    s.setCourseName("Turismo");
                    table.insertKey(new Node(new Student(s.getStudentNumber(), s.getName(), s.getClassification(), s.getCourseName())));
                    s.setStudentNumber(2020100003);
                    s.setName("Tigre Javardas");
                    s.setClassification(9.5);
                    s.setCourseName("E.Automacao");
                    table.insertKey(new Node(new Student(s.getStudentNumber(), s.getName(), s.getClassification(), s.getCourseName())));
                    s.setStudentNumber(1904000001);
                    s.setName("L.F.Vieira");
                    s.setClassification(20);
                    s.setCourseName("SL Benfica");
                    table.insertKey(new Node(new Student(s.getStudentNumber(), s.getName(), s.getClassification(), s.getCourseName())));

                    s.setStudentNumber(2020100100);
                    s.setName("Jesus Herói");
                    s.setClassification(19.5);
                    s.setCourseName("E.Informatica");
                    table.insertKey(new Node(new Student(s.getStudentNumber(), s.getName(), s.getClassification(), s.getCourseName())));
                    s.setStudentNumber(2111700555);
                    s.setName("Intel I9");
                    s.setClassification(4);
                    s.setCourseName("E.Mecanica");
                    table.insertKey(new Node(new Student(s.getStudentNumber(), s.getName(), s.getClassification(), s.getCourseName())));
                    s.setStudentNumber(2020100010);
                    s.setName("Ken of Barbie");
                    s.setClassification(2.7);
                    s.setCourseName("Turismo");
                    table.insertKey(new Node(new Student(s.getStudentNumber(), s.getName(), s.getClassification(), s.getCourseName())));
                    s.setStudentNumber(2020100005);
                    s.setName("Leia Maluca");
                    s.setClassification(9.5);
                    s.setCourseName("E.Automacao");
                    table.insertKey(new Node(new Student(s.getStudentNumber(), s.getName(), s.getClassification(), s.getCourseName())));
                    s.setStudentNumber(1904000002);
                    s.setName("Rui Costa");
                    s.setClassification(16.3);
                    s.setCourseName("SL Benfica");
                    table.insertKey(new Node(new Student(s.getStudentNumber(), s.getName(), s.getClassification(), s.getCourseName())));
                    separator();
                    break;

                case 2:
                    System.out.println("Type student ID (LAST 6 DIGITS) to search: ");
                    Node tempNode = table.getStudentKey(Read.oneInt());
                    System.out.println(tempNode.getStudent().toString());
                    separator();
                    break;

                case 3:
                    System.out.println("Type student ID to delete: ");
                    s.setStudentNumber(Read.oneInt());
                    table.eraseKey(s.getStudentNumber());
                    separator();
                    break;

                case 4:
                    System.out.println("Students list");
                    table.printKey();
                    separator();
                    break;

                case 5:
                    System.out.println("Number of students: " + table.getSize());
                    separator();
                    break;

                case 9:
                    System.out.println("Exit!");
                    break;

                default:
                    System.out.println("Invalid option!!");

            }
        } while (option != 9);
    }
}

