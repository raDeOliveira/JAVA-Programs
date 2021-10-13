package trabalho3lista;
//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 13/11/2020
//Time: 18:09
//Course: Informatic Engineering

import static java.lang.System.*;

public class Main {

    public static int exponent = -1; //if term degree enters with 0
    public static Node first; //points to first node

    //insert new node, if exists sum to equal node
    public static Node insertTerm(Node node, Term term){
        Node node2 = termSearch(term.getDegree());
        //sum of coefficients
        if(node2 != null) {
            Term term2 = node2.getNodeFirst();
            term2.setCoefficient(term.getCoefficient() + term2.getCoefficient());
            return first;
        } else {
            node.setNodeFirst(term);
            node.setNodeNext(first);
            return node;
        }
    }

    //deletes term
    public static Node deleteTerm(Node first, int value){
        Node node = first;
        if(node != null){
            if(node.getNodeFirst().getDegree() == value)
                first = first.getNodeNext();
            while(node != null){
                if(node.getNodeNext() == null)
                    break;
                if(node.getNodeNext().getNodeFirst().getDegree() == value){
                    node.setNodeNext(node.getNodeNext().getNodeNext());
                    break;
                }
                else
                    node = node.getNodeNext();
            }
            out.println("Deleted...");
        }
        return first;
    }

    //print all list elements with recursive method
    public static void recursiveListTerms(Node node){
        Term term;
        if(node != null){
            term = node.getNodeFirst();
            term.print();
            System.out.print(" -> ");
            recursiveListTerms(node.getNodeNext());
        }
        else{
            System.out.println( "null");
        }
    }

    //method to check polynomial degree
    public static int checkDegree(Node node){
        Term actualTerm = node.getNodeFirst();
        if (node.getNodeNext() != null){
            if (exponent < actualTerm.getDegree()){
                exponent = actualTerm.getDegree();
            }
            Node nextNode = node.getNodeNext();
            checkDegree(nextNode); //recursive method to check inserted an existing nodes

        } else {
            if (exponent < actualTerm.getDegree()){
                exponent = actualTerm.getDegree();
            }
        }
        return exponent;
    }

    //print number of existing terms
    public static int termCount(){
        Node node = first;
        int n = 0;
        if(node == null){
            out.println("List it's empty!");
        } else {
            while(node != null){
                n++;
                node = node.getNodeNext();
            }
        }
        return n;
    }

    //change nodes for ordenation method
    public static void change(Node a, Node b) {
        Term term = a.getNodeFirst();
        a.setNodeFirst(b.getNodeFirst());
        b.setNodeFirst(term);

    }

    //ordenation list by SelectionSort method
    public static Node insertionSort(Node list){
        double min;
        Node node = list, value, value2;
        if(list == null){
            out.println("List it's empty!");
        } else {
            while(node.getNodeNext() != null) {
                value = node;
                min = node.getNodeFirst().getDegree();
                for(value2=node.getNodeNext(); value2!=null; value2=value2.getNodeNext()) {
                    if (value2.getNodeFirst().getDegree() > min) {
                        value = value2;
                        min = value.getNodeFirst().getDegree();
                    }
                }
                change(node, value);
                node = node.getNodeNext();
            }
            out.println("Descendent 'exponent' ordenation: ");
        }
        return list;
    }

    //calculates polynomial expression
    public static double polynomialCalculate(double x){
        Node node = first;
        Term term;
        double value = 0.0;
            while(node != null){
                term = node.getNodeFirst();
                value += term.getCoefficient() * Math.pow(x, term.getDegree());
                node = node.getNodeNext();
        }
        out.println("Result of calculation: ");
        return value;
    }

    //search an existing term by degree to apply insertTerm method to check if they are the same
    public static Node termSearch(int n){
        Node node = first;
        Term term;
        while(node != null){
            term = node.getNodeFirst();
            if(term.getDegree() == n){
                break;
            } else {
                node = node.getNodeNext();
            }
        }
        if(node == null){

        }
        return node;
    }

    public static void main(String[] args) {
        int coef;
        out.println();
        out.println("=======================================");
        out.println("       *** Polynomial program ***");
        out.println("=======================================");

        do{
            out.println();
            out.println("1 - Insert term");
            out.println("2 - Delete a term");
            out.println("3 - List polynomial - RECURSIVE");
            out.println("4 - Check polynomial degree");
            out.println("5 - Term count");
            out.println("6 - Descendent exponent ordenation");
            out.println("7 - Calculate polynomial");
            out.println("0 - Exit");
            out.println();
            coef = Read.oneInt();

            switch(coef){
                case 1:
                    Node neww = new Node();
                    out.println("NEW TERM ");
                    out.println("Insert coeficient: ");
                    double d = Read.oneDouble();
                    System.out.println("Insert exponent for the coeficient");
                    int i = Read.oneInt();
                    Term newTerm = new Term( d, i);
                    first = insertTerm(neww, newTerm);
                    break;

                case 2:
                    if(first == null){
                        out.println("List it's empty!");
                    } else {
                        out.println("Type exponent to delete a term");
                        first = deleteTerm(first, Read.oneInt());
                    }
                    break;

                case 3:
                    out.println("Polynomial terms: ");
                    recursiveListTerms(first);
                    break;

                case 4:
                    if(first == null){
                        out.println("List it's empty!");
                    } else {
                        out.println("Polynomial degree is: ");
                        out.println(checkDegree(first));
                    }
                    break;

                case 5:
                    out.println("Number of terms = " + termCount());
                    break;

                case 6:
                    insertionSort(first);
                    break;

                case 7:
                    if(first == null){
                        out.println("List it's empty!");
                    } else {
                        out.println("Type the 'X' value to calculate expression: ");
                        double x = Read.oneDouble();
                        out.println(polynomialCalculate(x));
                    }
                    break;

                case 0:
                    out.println("Exit!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        } while(coef != 0);
    }

}
