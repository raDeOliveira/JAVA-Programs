package pootestafalar;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 29/05/2020

import java.util.*;

public class TestaFalar4 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Aluno a = new Aluno();
        
        System.out.println("Digite uma frase: ");
        a.falar(leia.nextLine());
        
    }
}