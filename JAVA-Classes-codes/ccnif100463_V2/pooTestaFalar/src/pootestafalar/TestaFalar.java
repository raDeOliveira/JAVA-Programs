package pootestafalar;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

import java.util.*;

public class TestaFalar {

    public static void main(String[] args) {
        
        char a = '=';
        char [] separador = new char [35];
        Arrays.fill(separador, a);
        
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        System.out.println(separador);
        
        //
        //printa resultado metodo falar
        aluno.falar();
        professor.falar();
        System.out.println(separador);
    }
}