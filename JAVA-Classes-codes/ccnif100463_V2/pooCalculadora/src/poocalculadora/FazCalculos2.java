package poocalculadora;

//@utor: RASO_@2019100463 //Eng_Informática
//Data: 

import java.util.*;

public class FazCalculos2 {

    public static void main(String[] args) {
        
        //
        //separador de linhas
        char c = '=';
        char [] separador = new char[45];
        Arrays.fill(separador, c);
        
        Scanner leia = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        
        double a, b;
        System.out.println("Digite o valor para 'A': ");
        a = leia.nextDouble();
        System.out.println("Digite o valor para 'B': ");
        b = leia.nextDouble();
        System.out.println(separador);
        System.out.println(separador);
        
        System.out.println("Soma = " + calculadora.soma(a, b));
        System.out.println(separador);
        
        System.out.printf("Subtração (c/ duas casas decimais) = %.2f\n", calculadora.subtrai(a, b));
        System.out.println(separador);
        
        System.out.printf("Multiplicação (c/ duas casas decimais) = %.2f\n", calculadora.multiplica(a, b));
        System.out.println(separador);
        
        System.out.printf("Divisão (c/ duas casas decimais) = %.2f\n", calculadora.divisao(a, b));
        System.out.println(separador);

    }
}