package pt;//IDE: IntelliJ@Jetbrains
//User: raOliveira
//Number: @ispg2019100463
//Date: 20/01/2021
//Time: 21:47
//Course: Informatic Engineering

import java.io.IOException;

public class Main {

    static char [] charr = new char[550]; //array with total characters

    //deletes duplicated characters
    public static char[] charArray(char[] array) {
        StringBuilder arr = new StringBuilder();
        for (char c : array) {
            if (arr.toString().indexOf(c) == -1) { // check if a char already exist, if not exist then return -1
                if (c != ' ') {
                    arr.append(c); // add new char
                }
            }
        }
        return arr.toString().toCharArray();
    }

    //max size of tree
    public static final int DIM = 30;

    //array dimension (position 0 ignored)
    public static final int DIMV = DIM+1;

    //array that represents binary tree
    public static int []array = new int[DIMV];

    //number of nodes in tree
    public static int N = 0;

    //largest positive number of 32 bits
    //sentinel to be placed at position 0 of array
    public static final int INTMAX = 2147483647;

    //insert new element in heap
    public static void insert(int []a, int x){
        if(N <= DIM){
            a[++N] = x;
            upHeap(a, N);
        }
    }

    //uprising heap to alocate value in the correct position
    public static void upHeap(int []a, int k){
        int x;
        x = a[k];
        a[0] = INTMAX; //sentinel
        while(a[k/2] <= x){
            a[k] = a[k/2];
            k = k/2;
        }
        a[k] = x;
    }

    //heapsort order method
    public static void heapSort(int []a, int n) {
        toHeap(a, n);

        while(n > 1) {
            int t = a[1];
            a[1] = a[n];
            a[n] = t;

            downHeap(a, --n, 1);
        }
    }

    //method to swap each node with the largest child
    public static void downHeap(int []a, int n, int k) {
        int j, v;
        v = a[k];
        while(k <= n/2){
            j = 2 * k;
            if(j < n && a[j] < a[j+1])
                j++;
            if(v >= a[j])
                break;
            a[k] = a[j];
            k = j;
        }
        a[k] = v;
    }

    //make the array into priority heap
    public static void toHeap(int []a, int n){
        for(int k = n/2; k >= 1; k--)
            downHeap( a, n, k );
    }

    //print array
    public static void print(int []v){
        System.out.println();
        for(int i=1; i<DIMV; i++){
            System.out.println("v[" + i + "] = " + v[i]);
        }
    }

    //method to remove from heap
    //removes the root that coreresponds to index 1 of array
    public static int remove(int []a){
        int x = a[1];
        a[1] = a[N--];
        downHeap(a, N, 1);
        return x;
    }

    //char count
    public static void countedChar() throws IOException {
        FileClass f1 = new FileClass();
        f1.openReading("teste.txt");
        String lineChar = f1.readLine();

        int[] freq = new int[lineChar.length()]; //array to store char occurrences

        //Converts given string into character array
        char [] string = lineChar.toCharArray();

        for(int i=0; i<lineChar.length(); i++) {
            freq[i] = 1;
            for(int j=i+1; j<lineChar.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;

                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                    charr[i] = lineChar.charAt(i); //stores values into char array
                }
            }
        }
        //displays the each character and their corresponding frequency
//        System.out.println("Characters and their corresponding frequencies");
//        for(int i = 0; i <freq.length; i++) {
//            if(string[i] != ' ' && string[i] != '0')
//                System.out.println(string[i] + "-" + freq[i]);
//        }
    }

    //main code
    public static void mainCode(char [] arr){
        char[] deleteDuplicates = charArray(arr); //array for the non duplicated chars

        //Node array for the deleted duplicates array
        Node []v = new Node[deleteDuplicates.length];

        //insert non repeated nodes into the array of Nodes
        for(int i=0; i<deleteDuplicates.length; i++){
            Node n = new Node();
            n.setCh(deleteDuplicates[i]);
            v[i] = n;
        }

        //count repetitions of each char
        for(int i=0; i<deleteDuplicates.length; i++){
            for (char c : arr) {
                if (v[i].getCh() == c) {
                    v[i].setRepetitions();
                }
            }
        }

        //insert values into Priority Heap
        for (Node node : v) {
            insert(array, node.getRepetitions());
        }

        System.out.println("==================================================================");
        System.out.println("Type the amount of the most characters frequency you wish to see: ");
        int num = Read.oneInt();

        for(int i=1; i <= num ;i++){
            int x = remove(array);
            for (Node node : v) {
                if (x == node.getRepetitions()) {
                    System.out.println(node.getCh() + ": " + x);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        countedChar(); //count chars method
        mainCode(charr); //start program

    }
}
