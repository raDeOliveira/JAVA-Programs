package pootestafalar;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

import java.util.*;

public class TestaFalar3 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        //
        //separador de linhas
        char a = '=';
        char [] separador = new char[30];
        Arrays.fill(separador, a);
        
        //
        //instâncias de sub classes
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        //
        //menu de escolha
        System.out.println("(A) - Aluno\n"
                + "(P) - Professor");
        System.out.println(separador);
        
        String opcao;
        System.out.println("Selecione uma opção: ");
        opcao = leia.nextLine().toLowerCase();
        
        //
        //switch case
        switch(opcao){
            case "a":
                System.out.println("Aluno:...");
                System.out.println("Digite o nome: ");
                aluno.setNome(leia.nextLine());
                System.out.println("Digite o género: ");
                aluno.setGenero(leia.next().charAt(0));
                System.out.println("Digite a idade: ");
                aluno.setIdade(leia.nextInt());
                System.out.println(separador);
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Género: " + aluno.getGenero());
                System.out.println("Idade: " + aluno.getIdade());
                
                
                aluno.falar();
                break;
            case "p":
                System.out.println("Professor:...");
                System.out.println("Digite o nome: ");
                professor.setNome(leia.nextLine());
                System.out.println("Digite o género: ");
                professor.setGenero(leia.next().charAt(0));
                System.out.println("Digite a idade: ");
                professor.setIdade(leia.nextInt());
                System.out.println(separador);
                System.out.println("Nome: " + professor.getNome());
                System.out.println("Género: " + professor.getGenero());
                System.out.println("Idade: " + professor.getIdade());
                
                professor.falar();
                break;
        }

    }
}