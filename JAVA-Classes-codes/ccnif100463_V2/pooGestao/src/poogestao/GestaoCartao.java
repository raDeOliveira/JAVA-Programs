package poogestao;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

public class GestaoCartao {

    public static void main(String[] args) {
        
        CartaoCliente cartao = new CartaoCliente("Ana");
        CartaoCliente cartao2 = new CartaoCliente("Sofia");
        
        System.out.println(cartao.getNumeroCartao());
        System.out.println(cartao.getNumeroCartao());
        System.out.println(cartao.getNumeroCartao());
        System.out.println(cartao2.getNumeroCartao());
        System.out.println(cartao2.getNumeroCartao());
        System.out.println(cartao2.getNumeroCartao());
    }
}