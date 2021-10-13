package trabalho1;

//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 17/10/2020
//Time: 16:37
//Course: Informatic Engineering

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import static java.lang.System.out;

public class interpolationMethod {

    public interpolationMethod() { //empty constructor
    }

    public static Ficheiro f1 = null; //instantiate object

    //INTERPOLATION METHOD
    public static int interpolationSearch(int num, int qty){
        Random random = new Random();
        int [] arr = new int[qty];
        for(int i=0; i< arr.length; i++){
            arr[i] = random.nextInt(50);
        }
        Arrays.sort(arr); //array sorted
        int left = 0;
        int right = arr.length - 1;

        while (arr[right] != arr[left] && num >= arr[left] && num <= arr[right]) {
            // estimate mid
            int mid = left + ((num - arr[left]) * (right - left) /
                    (arr[right] - arr[left]));

            if (num == arr[mid]) { //key value is found
                return mid;
            } else if (num < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (num == arr[left]) { //if key is found
            return left;
        }
        return -1; //num doesn't exist in the array
    }

    //execution time
    public static void sample(int qty) throws IOException {
        long start, stop, duration;
        String linha;
        int num = 2; //search number
        int index;
        //sample
        start = System.nanoTime(); //start time
        index = interpolationSearch(num, qty); //test
        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found in the array");
        stop = System.nanoTime(); //stop time
        duration = stop - start; //diference time
        out.println(duration + " ms; " + qty + " elements");
        linha = String.valueOf(duration); //records data
        f1.escreveLinha(qty + "; " + linha);
    }

    //main method
    public static void fourthMethod() throws IOException {
        f1 = new Ficheiro(); //instantiate object
        f1.abreEscrita("graficos/Interpolation method.csv"); //create file
        f1.escreveLinha("EXECUTION TIME FOR INTERPOLATION METHOD\n");

        //1 sample
        sample(100);
        //2 sample
        sample(200);
        //3 sample
        sample(300);
        //4 sample
        sample(400);
        //5 sample
        sample(500);
        //6 sample
        sample(600);
        //7 sample
        sample(700);
        //8 sample
        sample(800);
        //9 sample
        sample(900);
        //10 sample
        sample(1000);
        //11 sample
        sample(1100);
        //12 sample
        sample(1200);
        //13 sample
        sample(1300);
        //14 sample
        sample(1400);
        //15 sample
        sample(1500);
        //16 sample
        sample(1600);
        //17 sample
        sample(1700);
        //18 sample
        sample(1800);
        //19 sample
        sample(1900);
        //20 sample
        sample(2000);
        //21 sample
        sample(2100);
        //22 sample
        sample(2200);
        //23 sample
        sample(2300);
        //24 sample
        sample(2400);
        //25 sample
        sample(2500);
        //26 sample
        sample(2600);
        //27 sample
        sample(2700);
        //28 sample
        sample(2800);
        //29 sample
        sample(2900);
        //30 sample
        sample(3000);
        //31 sample
        sample(3100);
        //32 sample
        sample(3200);
        //33 sample
        sample(3300);
        //34 sample
        sample(3400);
        //35 sample
        sample(3500);
        //36 sample
        sample(3600);
        //37 sample
        sample(3700);
        //38 sample
        sample(3800);
        //39 sample
        sample(3900);
        //40 sample
        sample(4000);
        //41 sample
        sample(4100);
        //42 sample
        sample(4200);
        //43 sample
        sample(4300);
        //44 sample
        sample(4400);
        //45 sample
        sample(4500);
        //46 sample
        sample(4600);
        //47 sample
        sample(4700);
        //48 sample
        sample(4800);
        //49 sample
        sample(4900);
        //50 sample
        sample(5000);

        f1.fechaEscrita(); //close file
    }
}
