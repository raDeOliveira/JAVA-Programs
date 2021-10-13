package trabalho1;

//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 16/10/2020
//Time: 18:29
//Course: Informatic Engineering

import java.io.IOException;
import java.util.Random;
import static java.lang.System.*;

public class bubbleSort {

    public bubbleSort() { //empty constructor
    }

    public static Ficheiro f1 = null; //instantiate object

    //ORDENATION method (bubble sort)
    public static void numericalOrder(int [] arrStudents, int [] arrNotes){
        int temporaryNum;
        int temporaryName;
        for (int i=0; i<arrNotes.length; i++) {
            for (int j=i + 1; j<arrStudents.length; j++) {
                //change signal on if condition to change order
                if (arrNotes[i] < arrNotes[j]) {
                    temporaryNum = arrNotes[i];
                    temporaryName=arrStudents[i];

                    arrNotes[i] = arrNotes[j];
                    arrStudents[i] = arrStudents[j];

                    arrNotes[j] = temporaryNum;
                    arrStudents[j] = temporaryName;
                }
            }
            out.print(arrNotes[i] + ", ");
        }
    }

    //method to retrieve execution time
    public static void sample(int qty1, int qty2) throws IOException {
        Random random = new Random();
        long start, stop, duration;
        String linha;

        int [] arrStudents = new int[qty1];
        int [] arrNotes = new int[qty2];
        start = System.currentTimeMillis(); //start time
        for(int i=0; i<arrStudents.length; i++){ //test
            arrStudents[i] = random.nextInt(50);
            for(int j=0; j<arrNotes.length; j++){
                arrNotes[j] = random.nextInt(50);
            }
        }
        numericalOrder(arrStudents, arrNotes);
        stop = System.currentTimeMillis(); //stop time
        duration = stop - start; //diference time
        out.println("\n" + duration + " ms; " + qty1 + " elements");
        linha = String.valueOf(duration); //records data
        f1.escreveLinha(qty1 + "; " + linha);
    }

    //main method
    public static void firstMethod() throws IOException {
        f1 = new Ficheiro(); //instantiate object
        f1.abreEscrita("graficos/Bubble sort.csv"); //create file
        f1.escreveLinha("EXECUTION TIME FOR ORDENATION METHOD (based on bubble sort)\n");

        //1 sample
        sample(100, 100); //test
        //2 sample
        sample(200, 200); //test
        //3 sample
        sample(300, 300); //test
        //4 sample
        sample(400, 400); //test
        //5 sample
        sample(500, 500); //test
        //6 sample
        sample(600, 600); //test
        //7 sample
        sample(700, 700); //test
        //8 sample
        sample(800, 800); //test
        //9 sample
        sample(900, 900); //test
        //10 sample
        sample(1000, 1000); //test
        //11 sample
        sample(1100, 1100); //test
        //12 sample
        sample(1200, 1200); //test
        //13 sample
        sample(1300, 1300); //test
        //14 sample
        sample(1400, 1400); //test
        //15 sample
        sample(1500, 1500); //test
        //16 sample
        sample(1600, 1600); //test
        //17 sample
        sample(1700, 1700); //test
        //18 sample
        sample(1800, 1800); //test
        //19 sample
        sample(1900, 1900); //test
        //20 sample
        sample(2000, 2000); //test
        //21 sample
        sample(2100, 2100); //test
        //22 sample
        sample(2200, 2200); //test
        //23 sample
        sample(2300, 2300); //test
        //24 sample
        sample(2400, 2400); //test
        //25 sample
        sample(2500, 2500); //test
        //26 sample
        sample(2600, 2600); //test
        //27 sample
        sample(2700, 2700); //test
        //28 sample
        sample(2800, 2800); //test
        //29 sample
        sample(2900, 2900); //test
        //30 sample
        sample(3000, 3000); //test
        //31 sample
        sample(3100, 3100); //test
        //32 sample
        sample(3200, 3200); //test
        //33 sample
        sample(3300, 3300); //test
        //34 sample
        sample(3400, 3400); //test
        //35 sample
        sample(3500, 3500); //test
        //36 sample
        sample(3600, 3600); //test
        //37 sample
        sample(3700, 3700); //test
        //38 sample
        sample(3800, 3800); //test
        //39 sample
        sample(3900, 3900); //test
        //40 sample
        sample(4000, 4000); //test
        //41 sample
        sample(4100, 4100); //test
        //42 sample
        sample(4200, 4200); //test
        //43 sample
        sample(4300, 4300); //test
        //44 sample
        sample(4400, 4400); //test
        //45 sample
        sample(4500, 4500); //test
        //46 sample
        sample(4600, 4600); //test
        //47 sample
        sample(4700, 4700); //test
        //48 sample
        sample(4800, 4800); //test
        //49 sample
        sample(4900, 4900); //test
        //50 sample
        sample(5000, 5000); //test

        f1.fechaEscrita(); //close file
    }
}
