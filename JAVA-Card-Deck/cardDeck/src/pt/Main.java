package pt;
//IDE: IntelliJ@Jetbrains
//User: raOliveira
//Number: @ispg2019100463
//Date: 04/03/2021
//Time: 19:00
//Course: Informatic Engineering

import java.util.Arrays;
import static java.lang.System.*;

public class Main {

    //separator
    public static void separator(){
        char x = '=';
        char[] separator = new char[25];
        Arrays.fill(separator, x);
        out.println(separator);
    }

    public static void main(String[] args) {

        //object for the deck of cards
        Deck deck = new Deck();

        int option;
        do {
            out.println("[1] View cards");
            out.println("[2] Count cards");
            out.println();
            out.println("[0] EXIT!");
            option = Read.oneInt();
            switch (option) {
                case 1:
                    //show clubs suit
                    deck.showClubs();
                    separator();

                    //show diamonds suit
                    deck.showDiamonds();
                    separator();

                    //show spades suit
                    deck.showSpades();
                    separator();

                    //show hearts suit
                    deck.showHearts();
                    separator();
                    break;

                case 2:
                    //total cards
                    out.println("Total cards: " + deck.getCont());
                    separator();
                    break;
            }
        } while (option != 0);
    }

}
