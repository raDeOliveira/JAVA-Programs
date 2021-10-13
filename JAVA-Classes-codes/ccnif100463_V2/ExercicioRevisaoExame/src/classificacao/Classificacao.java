/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classificacao;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author fddcm
 */
public class Classificacao {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        String opcao;
        int nota=0;
        boolean verify=false;
        
        do{
            System.out.println("Prime <ENTER> para avançar.");
            read.nextLine();
            System.out.println("C - Inserir Classificação");
            System.out.println("M - Mau");
            System.out.println("I - Insuficiente");
            System.out.println("S - Suficiente");
            System.out.println("B - Bom");
            System.out.println("MB - Muito Bom");
            System.out.println("F - Fim");
            System.out.print("Insira uma opção: ");
            opcao=read.nextLine();
            
            
            
            switch(opcao.toUpperCase()) {
                case "C":
                    do{
                        System.out.print("Inserir a nota: ");
                        nota=read.nextInt();
                        
                        if(nota<0 || nota >20){
                            System.out.println("Nota inválida!");
                        }
                    }while(nota<0 || nota >20);
                    verify=true;
                break;
                
                case "M":
                    if (verify==true){
                        if(nota>=0 && nota<=4){
                            System.out.println("Classificação correta! Nota: Má.");                        
                        }
                        else{
                            System.out.println("Classificação incorreta!");
                        }
                    }
                    else
                        System.out.println("Erro! Falta inserir nota");
                break;
                
                case "I":
                    if (verify==true){
                        if(nota>=5 && nota<=9){
                            System.out.println("Classificação correta! Nota: Insuficiente.");                        
                        }
                        else{
                            System.out.println("Classificação incorreta!");
                        }
                    }
                    else
                        System.out.println("Erro! Falta inserir nota");
                break;
                
                case "S":
                    if (verify==true){
                        if(nota>=10 && nota<=13){
                            System.out.println("Classificação correta! Nota: Suficiente.");                        
                        }
                        else{
                            System.out.println("Classificação incorreta!");
                        }
                    }
                    else
                        System.out.println("Erro! Falta inserir nota");
                break;
                
                case "B":
                    if (verify==true){
                        if(nota>=14 && nota<=17){
                            System.out.println("Classificação correta! Nota: Bom.");                        
                        }
                        else{
                            System.out.println("Classificação incorreta!");
                        }
                    }
                    else
                        System.out.println("Erro! Falta inserir nota");
                break;
                
                case "MB":
                    if (verify==true){
                        if(nota>=18 && nota<=20){
                            System.out.println("Classificação correta! Nota: Muito Bom.");                        
                        }
                        else{
                            System.out.println("Classificação incorreta!");
                        }
                    }
                    else
                        System.out.println("Erro! Falta inserir nota");
                break;
                
                default:
                    System.out.println("Opção inserida é inválida!");
            }    
        }while(!("F").equals(opcao) && !("f").equals(opcao));
    }
    
}