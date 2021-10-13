package poocontabancariaversaodois;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

public class ContaPrazo extends ContaBancaria{
    
    //
    //variaveis de instancia
    private double taxaJuro = 0.1;
    private int prazoConta = 365;

    //
    //constutores
    public ContaPrazo() {
    }

    public ContaPrazo(String nomeTitular, double saldoConta, int prazoConta) {
        super(nomeTitular, saldoConta);
        this.prazoConta = prazoConta;
    }

    //
    //get-sets
    public double getTaxaJuro() {
        return taxaJuro;
    }

    public void setTaxaJuro(double taxaJuro) {
        this.taxaJuro = taxaJuro;
    }

    public void setPrazoConta(int prazoConta) {
        this.prazoConta = prazoConta;
    }

    public int getPrazoConta() {
        return prazoConta;
    }
    
    //
    //metodo printa saldo final
    public double saldoFinal(){
        return (super.getSaldoConta() + this.getSaldoConta() * taxaJuro) * prazoConta / 365;
    }

    @Override
    public String toString() {
        return "Taxa de juro: " + taxaJuro + "\n"
                + "Prazo de conta: " + prazoConta;
    }
}