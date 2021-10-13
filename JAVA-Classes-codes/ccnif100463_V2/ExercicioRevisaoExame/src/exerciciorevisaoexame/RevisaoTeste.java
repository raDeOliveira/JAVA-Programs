package exerciciorevisaoexame;
//
//autor RASO - exercicio revisão
//
// fifia para simular clear screen!!
// for (int i = 0; i < 50; ++i) System.out.println();
import java.util.*;

public class RevisaoTeste {
    
    public static int x = 0;
    
    //metodo insere classificação
    public static void insereClassificacao(){
            boolean flag = false;
            while(!flag){
                Scanner leia = new Scanner(System.in);
                System.out.println("Digite uma classificação: ");
                x = leia.nextInt();
                if(x < 0 || x > 20){
                    System.out.println("Nota inválida.");
                }else{
                    flag = true;
                }
            }
    }
    //metodo nota mau
    public static void notaMau(){
        if(x == 0){
            System.out.println("Digite nota primeiro pf.");
        }else if(x <= 4){
            System.out.println("Classificação correcta.");
            }else{
                System.out.println("Classificação incorrecta.");
        }
    }
    //metodo nota insuficiente
    public static void notaInsuficiente(){
        if(x == 0){
            System.out.println("Digite nota primeiro pf.");
        }else if(x >= 5 && x <= 9){
            System.out.println("Classificação correcta.");
        }else{
            System.out.println("Classificação incorrecta.");
        }
    }
    //metodo nota suficiente
    public static void notaSuficiente(){
        if(x == 0){
            System.out.println("Digite nota primeiro pf.");
        }else if(x >= 10 && x <= 13){
            System.out.println("Classificação correcta.");
        }else{
            System.out.println("Classificação incorrecta.");
        }
    }
    //metodo nota bom
    public static void notaBom(){
        if(x == 0){
            System.out.println("Digite nota primeiro pf.");
        }else if(x >= 14 && x <= 17){
            System.out.println("Classificação correcta.");
        }else{
            System.out.println("Classificação incorrecta.");
        }
    }
    //metodo nota muito bom
    public static void notaMuitoBom(){
        if(x == 0){
            System.out.println("Digite nota primeiro pf.");
        }else if(x >= 18 && x <= 20){
            System.out.println("Classificação correcta.");
        }else{
            System.out.println("Classificação incorrecta.");
        }
    }
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String opcao;
        do{
            System.out.println("(C) Insere classificação\n"
                    + "(M) Mau\n"
                    + "(I) Insuficiente\n"
                    + "(S) Suficiente\n"
                    + "(B) Bom\n"
                    + "(MB) Muito bom\n"
                    + "(F) Fim");
            System.out.println("===================================");
        
            System.out.println("Escolha uma opcção: ");
            opcao = leia.nextLine();
            // switch case
            switch(opcao){
                case "c":
                    insereClassificacao();
                    System.out.println("----------------------------");
                    System.out.println("----------------------------");
                    break;
                case "m":
                    notaMau();
                    System.out.println("----------------------------");
                    System.out.println("----------------------------");
                    break;
                case "i":
                    notaInsuficiente();
                    System.out.println("----------------------------");
                    System.out.println("----------------------------");
                    break;
                case "s":
                    notaSuficiente();
                    System.out.println("----------------------------");
                    System.out.println("----------------------------");
                    break;
                case "b":
                    notaBom();
                    System.out.println("----------------------------");
                    System.out.println("----------------------------");
                    break;
                case "mb":
                    notaMuitoBom();
                    System.out.println("----------------------------");
                    System.out.println("----------------------------");
                    break;
            }
        }while(!"f".equals(opcao) && (!"F".equals(opcao)));
    }
}