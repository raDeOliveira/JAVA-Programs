package poocontabancariaversaodois;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

import java.util.*;

public class Banco1 {

    public static void main(String[] args) {
        
        //
        //separador de linhas
        char a = '=';
        char [] separador = new char[30];
        Arrays.fill(separador, a);
        
        //
        //instâncias
        ContaBancaria conta = new ContaBancaria("Ruben", 500);
        ContaBancaria conta2 = new ContaBancaria("Maria", 650);
        System.out.println(conta.toString());
        System.out.println(separador);
        
        //
        //deposito de 100
        conta.despositar(100);
        System.out.println("Deposito de 100€...");
        System.out.println(conta.toString());
        System.out.println(separador);
        
        //
        //levantamento de 20
        //
        //deposito de 100
        conta.levantar(20);
        System.out.println("Levantamento de 20€...");
        System.out.println(conta.toString());
        System.out.println(separador);
        System.out.println(separador);
        
        //
        //segunda instância
        System.out.println("Segunda instância...");
        System.out.println(conta2.toString());
        System.out.println();
        
        //
        //resultado obtido foi a criação automatica de numero de conta
        
        //
        //novas funcionalidades
        System.out.println(separador);
        System.out.println("Novas funcionalidades");
        System.out.println(separador);
        
        //
        //conta a prazo
        ContaPrazo cprazo = new ContaPrazo("Lara", 500, 180);
        
        System.out.println("Saldo final com taxa de juro aplicada...Conta a Prazo!");
        System.out.printf("%.2f€\n", cprazo.saldoFinal());
        System.out.println(cprazo.toString());
        System.out.println(separador);
        
        //
        //contas a ordem
        ContaOrdem cordem = new ContaOrdem("Sofia", 200, 150);
        ContaOrdem cordem2 = new ContaOrdem("Ruben", 1000, 0);
        
        System.out.println("Comparação de contas...");
        cordem.compararedito(cordem2);
        System.out.println(separador);
        System.out.println(cordem.toString());
        System.out.println(cordem2.toString());
    }
}