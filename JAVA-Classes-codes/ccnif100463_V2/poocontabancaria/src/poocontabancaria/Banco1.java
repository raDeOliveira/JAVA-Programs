package poocontabancaria;

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
        
        //
        //resultado obtido foi a criação automatica de numero de conta
    }
}