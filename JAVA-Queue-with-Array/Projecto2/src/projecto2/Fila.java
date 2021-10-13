package projecto2;
//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 27/10/2020
//Time: 18:48
//Course: Informatic Engineering

import static java.lang.System.out;

public class Fila {

    //variables
    int front, rear, size;
    static final int CAPACITY = 5;
    int [] queue = new int[CAPACITY];

    //constructor with parameters
    public Fila(){
        front = 0;
        rear = - 1;
        size = 0;
    }

    //check empty method
    public boolean isEmpty(){
        return (size == 0);
    }

    //check full method
    public boolean isFull(){
        return (size == CAPACITY);
    }

    //add element method
    public void addElement(int element){
        if(isFull()){
            out.println("Queue is full");
        } else {
            rear = (rear + 1) % CAPACITY;
            queue[rear] = element;
            out.println("Element added: " + queue[rear]);
            size ++;
            out.println("After adding element, the size is = " + size);
        }
    }

    //remove element method
    public int removeElement(){
        if(isEmpty()){
            out.println("Queue empty");
            return Integer.MIN_VALUE;
        } else {
            int removed = queue[front];
            out.println("Element removed: " + removed);
            front = (front + 1) % CAPACITY;
            size --;
            return removed;
        }
    }

    //print results
    public void print(){
        if(isEmpty()){
            out.println("Queue empty");
        } else {
            out.println("Elements of queue: ");
            for(int i=front; i<(front+size); i++){
                out.print(" " + queue[i]);
            }
        }
    }

}
