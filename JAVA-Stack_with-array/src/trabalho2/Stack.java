package trabalho2;

//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 06/11/2020
//Time: 21:30
//Course: Informatic Engineering

import java.util.Arrays;

public class Stack {

    static final int SIZE = 50;
    String[] stack = new String[SIZE];
    String [] operands = new String[stack.length];
    int top = 0;

    //separator method
    public void separatorMethod(){
        char x = '=';
        char [] separator = new char[25];
        Arrays.fill(separator, x);
        System.out.println(separator);
    }

    //method to check is stack it's empty
    public boolean isEmpty(){
        return top <= 0; //return true if empty
    }

    //1- method to add element to the stack
    public void push(String data){
        if(top >= SIZE) {
            System.out.println("Stack it's full!");
        }else {
            stack = data.replace("(", " ").replace(")", " ").split("[-+*/()]");
            for(int i=0; i<stack.length; i++){
                if(stack[i].equals("+") || stack[i].equals("-") || stack[i].equals("*") ||
                        stack[i].equals("/") || stack[i].equals("(") || stack[i].equals(")")) {

                } else {
                    System.out.println(stack[i] + ": added to stack!");
                    operands[top++] = data; //element to add
                }
            }
        }
    }

    //2- method to remove element to the stack
    public void pop(){
        String data = "";
        if(isEmpty()){
            System.out.println("Stack it's empty!");
        } else {
            top--;
            data = stack[top]; //element to remove
            stack[top] = String.valueOf(0); //updates real time stack elements
            System.out.println("Element removed: " + data);
        }
    }

    //3- method to check stack size
    public void size(){
        if(isEmpty()){
            System.out.println("Stack it's empty!");
        } else {
            System.out.println("The stack size is: " + top);
        }
    }

    //4- method to view stack elements
    public void showElements(){
        if(isEmpty()){
            System.out.println("Stack it's empty!");
        } else {
            System.out.println("Stack elements: ");
            for(String v : stack){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    //4- method to peek top of the stack element
    public void peek(){
        String data = "";
        if(isEmpty()){
            System.out.println("Stack it's empty!");
        } else {
            data = stack[top-1]; //top element
            System.out.println("Element on top: " + data);
        }
    }

    //5- method to reverse expression
    public void reverseExpression(String str){
        if(isEmpty()){
            System.out.println("Stack it's empty!");
        } else {
            str = str.replace(')', '('); //invert parenthesis
            str = str.replace('(', ')'); //invert parenthesis
            for(int i=0; i<stack.length; i++){
                pop();
            }
            separatorMethod();
            String[] splitted = str.split(" ");
            System.out.println("Reversed expression: ");
            for (int i=splitted.length - 1; i>=0; i--) {
                System.out.print(splitted[i]); //print reversed expression
            }
            System.out.println();
        }
    }
}

