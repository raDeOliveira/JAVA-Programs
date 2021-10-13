package pootestafalar;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

public class Aluno extends Pessoa{
    
    //
    //variaveis de instacia
    private int numeroAluno;
    private String turmaAluno;

    //
    //construtor s/ parametros
    public Aluno() {
    }

    //
    //construtor c/ parametros
    public Aluno(String nome, char genero, int idade, int numeroAluno, String turmaAluno) {    
        super(nome, genero, idade);
        this.numeroAluno = numeroAluno;
        this.turmaAluno = turmaAluno;
    }

    //
    //gets
    public int getNumeroAluno() {
        return numeroAluno;
    }

    public String getTurmaAluno() {
        return turmaAluno;
    }
    
    //
    //metodos sobre escrito
    @Override
    public void falar(){
        super.falar();
        System.out.println("e sou um aluno.");
    }

    @Override
    public String toString() {
        return super.toString() + "Número: " + numeroAluno + "\n"
                + "Turma: " + turmaAluno;
    }
}