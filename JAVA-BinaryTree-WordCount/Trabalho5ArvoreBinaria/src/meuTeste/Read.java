package meuTeste;
//IDE: IntelliJ@Jetbrains
//User: raOliveira
//Number: @ispg2019100463
//Date: 01/01/2021
//Time: 22:13
//Course: Informatic Engineering

import static java.lang.System.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {

    private Read() {}

    public static int oneInt() {
        while(true) {
            try{
                return Integer.valueOf(oneString().trim()).intValue();
            }
            catch(Exception e){
                out.println("Not an integer");
            }
        }
    }

    public static float oneFloat() {
        while(true) {
            try{
                return Float.valueOf(oneString().trim()).floatValue();
            }
            catch(Exception e){
                out.println("Not a float");
            }
        }
    }

    public static double oneDouble() {
        while(true) {
            try{
                return Double.valueOf(oneString().trim()).doubleValue();
            }
            catch(Exception e){
                out.println("Not a double");
            }
        }
    }


    public static String oneString() {
        String s = "";
        try {
            BufferedReader in = new BufferedReader(new
                    InputStreamReader(System.in), 1);
            s = in.readLine();
        } catch(IOException e) {
            out.println("Error");
        }
        return s;
    }

}