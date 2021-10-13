package meuTeste;
//IDE: IntelliJ@Jetbrains
//User: raOliveira
//Number: @ispg2019100463
//Date: 31/12/2020
//Time: 19:07
//Course: Informatic Engineering

import java.util.ArrayList;

public class Node {

    private String data; //variable to store word
    private int counter = 1;
    private Node left;
    private Node right;
    ArrayList<Integer> lines = new ArrayList<Integer>(); //stores the lines where word appears

    Node(){}

    //store word repetitions
    public void setRepetitions(){
        counter++;
    }

    public int getRepetitions(){
        return counter;
    }

    public String getdata(){
        return data;
    }

    //stores the word number lines
    public void setArrayList(int line){
        lines.add(line);
    }

    public ArrayList<Integer> getArrayList(){
        return lines;
    }

    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }

    //writes the word in node if word don't exists and the line where word appears
    //case word already exists, only writes the line
    public void setData(String d, int line){
        data = d;
        setArrayList(line);
    }

    public void setLeft(Node node){
        left = node;
    }

    public void setRight(Node node){
        right = node;
    }

    public String toString(){
        return data;
    }

    //needed for Collections.sort()
    public int compareTo(Node node){
        if(data.compareTo(node.data) > 0){
            return 1;
        } else {
            if(data.compareTo(node.data) < 0){
                return -1;
            } else {
                return 0;
            }
        }
    }
}