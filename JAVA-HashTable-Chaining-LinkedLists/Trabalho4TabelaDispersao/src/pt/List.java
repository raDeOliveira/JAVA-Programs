package pt;
//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 08/12/2020
//Time: 21:04
//Course: Informatic Engineering

public class List {

    private Node first; //first node

    public List() { //constructor
        first = null;
    }

    public boolean empty() { //check if empty
        return (first == null);
    }

    public void insertList(Student student) { //insert list
        Node list = new Node(student); //creating memory for the node
        if (empty()) {
            list.setNext(null);
            first = list;
            return;
        }
        Node actual = first;
        while (actual.getNext() != null) { //iterating the nodes
            actual = actual.getNext();
        }
        actual.setNext(list);
        list.setNext(null);
    }

    public void printList() { //prints the list
        Node actual = first;
        while (actual != null) {
            actual.showStudentAttributes();
            actual = actual.getNext();
        }
    }

    public int studentIdLast6Digits(int key) { //function to retrieve last 6 digits from student ID
        return key % 1000000;
    }

    public Node getStudentId(int key){ //gets student ID
        if (studentIdLast6Digits(first.getStudent().getStudentNumber()) == key){
            return first;
        } else {
            for (Node actual=first.getNext(); actual!=null; actual=actual.getNext()){
                if (studentIdLast6Digits(actual.getStudent().getStudentNumber()) == key){
                    return actual;
                }
            }
        }
        return null;
    }

    public boolean searchList(int key) { //search key student in list
        Node actual = first;
        while (actual != null) {
            if(actual.getStudent().getStudentNumber() == key) {
                return true;
            }
            actual = actual.getNext();
        }
        return false;
    }

    public boolean searchList2(int key) { //search key student in list
        Node actual = first;
        while (actual != null) {
            if(studentIdLast6Digits(actual.getStudent().getStudentNumber()) == key) {
                return true;
            }
            actual = actual.getNext();
        }
        return false;
    }

    public void eraseList(int value) {  //erase node
        if (!searchList2(value)) {
            System.out.println("*** Attention, not found! ***");
            return;
        }
        Node actual, before;
        actual = before = first;
        while (actual!=null) {
            if(studentIdLast6Digits(actual.getStudent().getStudentNumber()) == value) {
                break;
            }
            before = actual;
            actual = actual.getNext();
        }
        if (actual == first) {
            first = first.getNext();
        } else {
            before.setNext(actual.getNext());
        }
    }

}
