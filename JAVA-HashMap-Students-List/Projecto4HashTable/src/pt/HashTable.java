package pt;
//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 24/11/2020
//Time: 18:14
//Course: Informatic Engineering

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class HashTable {

    //separator
    public static void separator(){
        char x = '=';
        char [] separator = new char[30];
        Arrays.fill(separator, x);
        System.out.println(separator);
    }

    public static void main(String[] args) {

        HashMap <String, Student> classA = new HashMap <String, Student> ();
        int option;
        String n;

        System.out.println();
        System.out.println("===================================");
        System.out.println("********** Students list **********");
        System.out.println("===================================");
        do {
            System.out.println("1 - Insert");
            System.out.println("2 - Search");
            System.out.println("3 - Delete");
            System.out.println("4 - View list");
            System.out.println("9 - Exit");
            option = Read.oneInt();
            separator();

            switch (option) {
                case 1:
                    Student a1 = new Student();
                    System.out.println("Insert identification number: "); //insert number
                    a1.setStudentNumber(Read.oneString());
                    System.out.println("Insert name: "); //insert name
                    a1.setName(Read.oneString());
                    System.out.println("Insert classification: "); //insert classification
                    a1.setClassification(Read.oneDouble());
                    System.out.println("Insert course name: "); //insert course
                    a1.setCourseName(Read.oneString());
                    classA.put(a1.getStudentNumber(), a1); //insert key and values to hashmap
                    separator();
                    break;

                case 2:
                    Student a2;
                    if(classA.isEmpty()){
                        System.out.println("List it's empty!");
                    } else {
                        System.out.println("Insert student number to search: ");
                        n = Read.oneString();
                        a2 = classA.get(n); //search desired key
                        if(classA.get(n) == null){
                            System.out.println("Identificação não existente!");
                        } else {
                            a2.print();
                        }
                    }
                    separator();
                    break;

                case 3:
                    if(classA.isEmpty()){
                        System.out.println("List it's empty!");
                    } else {
                        System.out.println("Insert student number to delete: ");
                        n = Read.oneString();
                        classA.remove(n); //remove desired key
                    }
                    separator();
                    break;

                case 4:
                    Student a5 = null;
                    if(classA.isEmpty()){
                        System.out.println("List it's empty!");
                    } else {
                        for (Iterator it = classA.values().iterator(); it.hasNext(); ) {
                            a5 = (Student) it.next();
                            a5.print();
                        }
                    }
                    separator();
                    break;

                case 9:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid option!");
                    separator();

            }
        } while (option != 9);
    }
}


