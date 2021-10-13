package trabalho3lista;
//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 13/11/2020
//Time: 18:08
//Course: Informatic Engineering

import static java.lang.System.*;

public class Node {

    private Term nodeFirst; //object to save node
    private Node nodeNext; //object to next node

    Node(){} //empty constructor

    Node(Term t){ //constructor with arguments
        nodeFirst = t;
        nodeNext = Main.first;
        Main.first = this;
    }

    //getters
    public Node getNodeNext(){
        return nodeNext;
    }

    public Term getNodeFirst(){
        return nodeFirst;
    }

    //setters
    public void setNodeFirst(Term t){
        nodeFirst = t;
    }

    public void setNodeNext(Node n){
        nodeNext = n;
    }

}
