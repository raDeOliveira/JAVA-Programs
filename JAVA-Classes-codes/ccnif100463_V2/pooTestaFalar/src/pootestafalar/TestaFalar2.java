package pootestafalar;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

import java.util.*;

public class TestaFalar2 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        //
        //separador de linhas
        char a = '=';
        char [] separador = new char[30];
        Arrays.fill(separador, a);
        
        //
        //instâncias de sub classes
        Aluno aluno = new Aluno("Rúben Oliveira", 'M', 35, 4253, "Ei");
        Professor professor = new Professor("Lara", 'F', 20, 500, 2);
        
        //
        //menu de escolha
        System.out.println("(A) - Aluno\n"
                + "(P) - Professor");
        System.out.println(separador);
        
        char opcao;
        System.out.println("Selecione uma opção: ");
        opcao = leia.next().toLowerCase().charAt(0);
        
        //
        //switch case
        switch(opcao){
            case 'a':
                System.out.println("Aluno:...");
                System.out.println(aluno.toString());
                System.out.println(separador);
                
                aluno.falar();
                break;
            case 'p':
                System.out.println("Professor:...");
                System.out.println(professor.toString());
                System.out.println(separador);
                
                professor.falar();
                break;
        }
    }
}