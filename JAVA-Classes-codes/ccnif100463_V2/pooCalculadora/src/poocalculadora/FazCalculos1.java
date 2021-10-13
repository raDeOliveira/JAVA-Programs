package poocalculadora;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

import java.util.*;

public class FazCalculos1 {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        
        //
        //separador de linhas
        char a = '=';
        char [] separador = new char[25];
        Arrays.fill(separador, a);
        
        
        //
        //printa soma
        System.out.println("Soma = " + calculadora.soma(2.7, 5.2));
        System.out.println(separador);
        
        //
        //printa subtração
        System.out.println("Subtração = " + calculadora.subtrai(2.7, 5.2));
        System.out.println(separador);
        
        //
        //printa multiplicação com duas casas decimais
        System.out.printf("Multiplicação (c/ duas casas decimais) = %.2f\n", calculadora.multiplica(2.7, 5.2));
        System.out.println(separador);
        
        //
        //printa divisão
        System.out.println("Divisão = " + calculadora.divisao(2.7, 5.2));

    }
}