package projecto2;
//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 27/10/2020
//Time: 18:51
//Course: Informatic Engineering

import java.util.*;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char x = '='; //separator
        char [] separator = new char[25];
        Arrays.fill(separator, x);

        Fila fila = new Fila(); //object instantiated

        fila.addElement(4);
        out.println(separator);
        fila.addElement(7);
        out.println(separator);
        fila.addElement(9);
        out.println(separator);
//        fila.addElement(1);
//        out.println(separator);
//        fila.addElement(6);
//        out.println(separator);
//        fila.addElement(3); //queue is full here, max length it's 5
//        out.println(separator);

        //fila.removeElement();
        //out.println(separator);
        //fila.removeElement();
        //out.println(separator);
        out.println("Front element is: " + fila.queue[fila.front]);
        out.println("Rear element is: " + fila.queue[fila.rear]);
        out.println(separator);
        fila.print();

    }
}

