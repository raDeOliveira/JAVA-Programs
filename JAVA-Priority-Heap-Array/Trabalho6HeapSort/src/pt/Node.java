package pt;
//IDE: IntelliJ@Jetbrains
//User: raOliveira
//Number: @ispg2019100463
//Date: 20/01/2021
//Time: 21:48
//Course: Informatic Engineering

public class Node {

    private char ch;
    private int count = 0;

    Node() {
        ch = ' ';
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char s) {
        ch = s;
    }

    public int getRepetitions() {
        return count;
    }

    public void setRepetitions() {
        count++;
    }
}
