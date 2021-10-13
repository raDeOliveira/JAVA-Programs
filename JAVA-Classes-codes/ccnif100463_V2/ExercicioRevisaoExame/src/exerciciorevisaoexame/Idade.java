package exerciciorevisaoexame;

import java.util.*;

public class Idade {
    
    public static final int ano = 2019;
    
    public static void idade(){
        Scanner leia = new Scanner(System.in);
        System.out.println("ano nascimento: ");
        int x = leia.nextInt();
        int idade = (2019 - x);
        
        if(idade <= 10){
            System.out.println("criança");
        }else if(idade >= 10 && idade <= 14){
            System.out.println("menor de idade");
        }else{
            System.out.println("adulto");
        }
    }

    public static void main(String[] args) {

        idade();

    }
}