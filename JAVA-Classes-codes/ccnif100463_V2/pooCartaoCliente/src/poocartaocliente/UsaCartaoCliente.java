package pooCartaoCliente;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

import java.util.*;

public class UsaCartaoCliente {

    public static void main(String[] args) {
        
        CartaoCliente cartao = new CartaoCliente();
        CartaoCliente cartao2 = new CartaoCliente(500, "Laura");
        char a = '=';
        char [] separador = new char[35];
        Arrays.fill(separador, a);
        
        //
        //printa resultados com SOUT no metodo
        cartao.mostraPontos();
        cartao2.mostraPontos();
        System.out.println(separador);
        
        //
        //credita 45.5 pontos em 1ª instancia
        cartao.creditaPontos(45.5);
        
        //
        //printa resultados com SOUT no metodo
        cartao.mostraPontos();
        cartao2.mostraPontos();
        System.out.println(separador);
        
        //
        //transfere pontos
        cartao2.transferePontos(cartao);
        cartao.mostraPontos();
        cartao2.mostraPontos();
        System.out.println(separador);
        
        //
        //debita 20 pontos na 2ª instancia
        cartao2.debitaPontos(20);
        cartao.mostraPontos();
        cartao2.mostraPontos();

    }
}