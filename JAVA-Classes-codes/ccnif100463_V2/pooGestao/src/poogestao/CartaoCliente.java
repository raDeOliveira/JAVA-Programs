package poogestao;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

public class CartaoCliente {
    
    private static int contCartao;
    private int numeroCartao;
    private String nomeTitular;
    private int numeroPontos;
    
    //construtor s/ parametros
    public CartaoCliente() {
        //this.setNumeroCartao(++contCartao);
    }
    
    //construtor c/ parametros
    public CartaoCliente(int numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        //contCartao ++;
    }
    
    //metodo creditar pontos
    public void creditaPontos(double credita){
        numeroPontos += credita;
    }
    
    //metodo debita pontos
    public void debitaPontos(double debita){
        numeroPontos -= debita;
    }
    
    //metodo mostra pontos
    public void mostraPontos(){
        System.out.println(getNomeTitular() + " tem " + numeroPontos + " pontos.");;
    }
    
    //metodo transfere pontos
    public void transferePontos(CartaoCliente cliente){
        numeroPontos = cliente.numeroPontos;
        cliente.numeroPontos = 0;
    }

    //
    //gera numero cartao automatico
    public CartaoCliente(String nomeTitular) {
        this.setNumeroCartao(++contCartao);
        this.nomeTitular = nomeTitular;
    }
    
    

    //get-sets
    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroPontos() {
        return numeroPontos;
    }

    public void setNumeroPontos(int numeroPontos) {
        this.numeroPontos = numeroPontos;
    }
}