package poocontabancariaversaodois;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

public class ContaOrdem extends ContaBancaria{
    
    //
    //variaveis de instancia
    private double limiteCredito = -100;

    //
    //construtores
    public ContaOrdem() {
    }

    public ContaOrdem(String nomeTitular, double saldoConta, double limiteCredito) {
        super(nomeTitular, saldoConta);
        if(limiteCredito != 0){
            this.limiteCredito = limiteCredito;
        }
    }

    //
    //get-set
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    //
    //metodo compara creditos
    public void compararedito(ContaOrdem contaOrdem){
        if(getLimiteCredito() > contaOrdem.getLimiteCredito()){
            System.out.println("Conta 1 tem maior limite");
        }else if(getLimiteCredito() < contaOrdem.getLimiteCredito()){
            System.out.println("Conta 2 tem maior limite");
        }else{
            System.out.println("Os limites de crédito são iguais.");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + getNomeTitular() + "\n"
                + "Limite de crédito: " + limiteCredito;
    }
}