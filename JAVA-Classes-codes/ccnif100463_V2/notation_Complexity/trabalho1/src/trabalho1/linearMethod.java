package trabalho1;

//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 17/10/2020
//Time: 16:12
//Course: Informatic Engineering

import java.io.IOException;
import java.util.Random;
import static java.lang.System.*;

public class linearMethod {

    public linearMethod() { //empty constructor
    }

    public static Ficheiro f1 = null; //instantiate object

    //LINEAR SEARCH method
    public static void linearSearch(int num, int qty) throws IOException {
        Random random = new Random();
        long start, stop, duration;
        String linha;
        //sample
        int [] arr = new int[qty];
        start = System.currentTimeMillis(); //start time
        for(int i=0; i<arr.length; i++){
            arr[i] = random.nextInt(50);
            if(num == arr[i]){
            }
            out.print("Found at " + arr[i] + ", ");
        }
        stop = System.currentTimeMillis(); //stop time
        duration = stop - start; //diference time
        out.println("\n" + duration + " ms; " + qty + " elements");
        linha = String.valueOf(duration); //records data
        f1.escreveLinha(qty + "; " + linha);
    }

    //main method
    public static void thirdMethod() throws IOException {
        f1 = new Ficheiro(); //instantiate object
        f1.abreEscrita("graficos/Linear method.csv"); //create file
        f1.escreveLinha("EXECUTION TIME FOR LINEAR METHOD\n");
        int num = 4; //search number

        //1 sample
        linearSearch(num, 100); //test
        //2 sample
        linearSearch(num, 200); //test//
        //3 sample
        linearSearch(num, 300); //test
        //4 sample
        linearSearch(num, 400); //test
        //5 sample
        linearSearch(num, 500); //test
        //6 sample
        linearSearch(num, 600); //test
        //7 sample
        linearSearch(num, 700); //test
        //8 sample
        linearSearch(num, 800); //test
        //9 sample
        linearSearch(num, 900); //test
        //10 sample
        linearSearch(num, 1000); //test
        //11 sample
        linearSearch(num, 1100); //test
        //12 sample
        linearSearch(num, 1200); //test//
        //13 sample
        linearSearch(num, 1300); //test
        //14 sample
        linearSearch(num, 1400); //test
        //15 sample
        linearSearch(num, 1500); //test
        //16 sample
        linearSearch(num, 1600); //test
        //17 sample
        linearSearch(num, 1700); //test
        //18 sample
        linearSearch(num, 1800); //test
        //19 sample
        linearSearch(num, 1900); //test
        //20 sample
        linearSearch(num, 2000); //test
        //21 sample
        linearSearch(num, 2100); //test
        //22 sample
        linearSearch(num, 2200); //test//
        //23 sample
        linearSearch(num, 2300); //test
        //24 sample
        linearSearch(num, 2400); //test
        //25 sample
        linearSearch(num, 2500); //test
        //26 sample
        linearSearch(num, 2600); //test
        //27 sample
        linearSearch(num, 2700); //test
        //28 sample
        linearSearch(num, 2800); //test
        //29 sample
        linearSearch(num, 2900); //test
        //30 sample
        linearSearch(num, 3000); //test
        //31 sample
        linearSearch(num, 3100); //test
        //32 sample
        linearSearch(num, 3200); //test//
        //33 sample
        linearSearch(num, 3300); //test
        //34 sample
        linearSearch(num, 3400); //test
        //35 sample
        linearSearch(num, 3500); //test
        //36 sample
        linearSearch(num, 3600); //test
        //37 sample
        linearSearch(num, 3700); //test
        //38 sample
        linearSearch(num, 3800); //test
        //39 sample
        linearSearch(num, 3900); //test
        //40 sample
        linearSearch(num, 4000); //test
        //41 sample
        linearSearch(num, 4100); //test
        //42 sample
        linearSearch(num, 4200); //test
        //43 sample
        linearSearch(num, 4300); //test//
        //44 sample
        linearSearch(num, 4400); //test
        //45 sample
        linearSearch(num, 4500); //test
        //46 sample
        linearSearch(num, 4600); //test
        //47 sample
        linearSearch(num, 4700); //test
        //48 sample
        linearSearch(num, 4800); //test
        //49 sample
        linearSearch(num, 4900); //test
        //50 sample
        linearSearch(num, 5000); //test

        f1.fechaEscrita(); //close file
    }
}
