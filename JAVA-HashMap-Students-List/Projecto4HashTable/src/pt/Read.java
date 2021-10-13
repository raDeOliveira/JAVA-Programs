package pt;
//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 24/11/2020
//Time: 18:18
//Course: Informatic Engineering

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;

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
