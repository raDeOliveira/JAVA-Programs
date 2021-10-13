package trabalho2;

//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 06/11/2020
//Time: 21:30
//Course: Informatic Engineering

public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();
        int option;
        String expr;
        String expr2 = "";

        do{
            System.out.println( "1 - Insert expression" );
            System.out.println( "2 - Remove element" );
            System.out.println( "3 - View stack size" );
            System.out.println( "4 - View stack elements" );
            System.out.println( "5 - Peek top element" );
            System.out.println( "6 - Reverse expression" );
            System.out.println( "7 - Exit");
            System.out.println();

            option = Le.umInt();

            switch( option ){
                case 1:
                    System.out.println("Type expression with spaces please: ");
                    expr = Le.umaString();
                    expr2 = expr;
                    s.push(expr);
                    s.separatorMethod();
                    break;

                case 2:
                    s.pop();
                    s.separatorMethod();
                    break;

                case 3:
                    s.size();
                    s.separatorMethod();
                    break;

                case 4:
                    s.showElements();
                    s.separatorMethod();
                    break;

                case 5:
                    s.peek();
                    s.separatorMethod();
                    break;

                case 6:
                    s.reverseExpression(expr2);
                    s.separatorMethod();
                    break;

                case 7:
                    System.out.println("Exit");
                    System.exit(0);

                default:
                    System.out.println("Invalid option!");

            }
        } while(option != 7);

    }
}
