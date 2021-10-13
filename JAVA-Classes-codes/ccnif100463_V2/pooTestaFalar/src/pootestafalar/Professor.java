package pootestafalar;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

public class Professor extends Pessoa{
    
    //
    //variaveis de instacia
    private int grupoDocencia;
    private int escalaoProfessor;

    //
    //construtor s/ parametros
    public Professor() {
    }

    //
    //construtor c/ parametros
    public Professor(String nome, char genero, int idade, int grupoDocencia, int escalaoProfessor) {
        super(nome, genero, idade);
        this.grupoDocencia = grupoDocencia;
        this.escalaoProfessor = escalaoProfessor;
    }

    //
    //gets
    public int getGrupoDocencia() {
        return grupoDocencia;
    }

    public int getEscalaoProfessor() {
        return escalaoProfessor;
    }
    
    //
    //metodos sobre escrito
    @Override
    public void falar(){
        super.falar();
        System.out.println("e sou um professor.");
    }

    @Override
    public String toString() {
        return super.toString() + "Grupo docência: " + grupoDocencia + "\n"
                + "Escalão professor: " + escalaoProfessor;
    }
}