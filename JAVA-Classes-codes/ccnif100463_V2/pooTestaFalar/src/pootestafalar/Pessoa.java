package pootestafalar;

//@utor: RASO //Eng_Informática
//Data: 29/05/2020

class Pessoa{
    
    //
    //variáveis de instancia
    private String nome;
    private char genero;
    private int idade;
      
    //
    //construtor vazio
    public Pessoa(){
    }

    //
    //construtores com parametros
    public Pessoa( String nome, char genero ){
          this.nome = nome;
          this.genero = genero;
    }

    public Pessoa( String nome, char genero, int idade ){
          this.nome = nome;
          this.genero = genero;
          this.idade = idade;
    }
    
    //
    //GET - SETS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //
    //metodo falar
    public void falar(){
        System.out.print( "Sou uma pessoa...");
    }
    
    
    
    public void falar(String frase){
        System.out.println(frase);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n"
                + "Género: " + genero + "\n"
                + "Idade: " + idade + "\n";
    }
    
}