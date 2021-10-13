package pt;
//IDE: IntelliJ@Jetbrains
//User: raOliveira
//Number: @ispg2019100463
//Date: 04/03/2021
//Time: 19:39
//Course: Informatic Engineering

public class Deck {

    //initiate counter
    private int cont = 0;

    //instantiate card and suit objects
    Cards card = new Cards();
    Suit suit = new Suit();

    //show deck methods
    public void showClubs(){
        for (String i : card.getCards()) {
            cont++;
            System.out.println(i + " of " + suit.getClubs());
        }
    }

    public void showDiamonds(){
        for (String i : card.getCards()) {
            cont++;
            System.out.println(i + " of " + suit.getDiamonds());
        }
    }

    public void showSpades(){
        for (String i : card.getCards()) {
            cont++;
            System.out.println(i + " of " + suit.getSpades());
        }
    }

    public void showHearts(){
        for (String i : card.getCards()) {
            cont++;
            System.out.println(i + " of " + suit.getHearts());
        }
    }

    //get counter method
    public int getCont() {
        return cont;
    }
}
