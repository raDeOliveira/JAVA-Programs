package poocontabancaria;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

public class ContaBancaria {
    
    //
    //variavel de instancias (classes)
    private static int contConta;
            
    private int numeroConta;
    private String nomeTitular;
    private double saldoConta;

    //
    //construtores
    public ContaBancaria() {
    }

    public ContaBancaria(String nomeTitular, double saldoConta) {
        this.nomeTitular = nomeTitular;
        this.saldoConta = saldoConta;
        this.setNumeroConta(++contConta);
    }

    //
    //get-sets
    public static int getContConta() {
        return contConta;
    }

    public static void setContConta(int contConta) {
        ContaBancaria.contConta = contConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
    
    //
    //metodo depositar
    public void despositar(double deposita){
        this.saldoConta += deposita;
    }
    
    //
    //metodo levanta
    public void levantar(double levanta){
        if(this.getSaldoConta() > levanta){
            this.saldoConta -= levanta;
        }else{
            System.out.println("Levantamento não permitido.");
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nomeTitular + "\n"
                + "Número de conta: " + numeroConta + "\n"
                + "Saldo: " + saldoConta + "€";
    }
    
}