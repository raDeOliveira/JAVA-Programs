package pt;
//IDE: IntelliJ@Jetbrains
//User: RASO Olive
//Number: @ispg2019100463
//Date: 08/12/2020
//Time: 21:04
//Course: Informatic Engineering

public class HashList {

    private static final double LOAD_FACTOR = 0.75;
    private List[] table; //array for the list
    private int MAXSIZE; //constant for lists size
    private int size; //for students

    public HashList(int size) {
        table = new List[size]; //array for key stores
        MAXSIZE = size;
        for(int i=0; i<size; i++)
            table[i] = null;
    }

    public int hashFunction(int key) { //hash function that calculates key store position
        return key % MAXSIZE;
    }

    public void rehash() { //rehash function if list oversize 0.75 factor
        List [] tmp = table;
        table = new List[tmp.length * 2];
        MAXSIZE = table.length;
        for (int i=0; i<tmp.length; i++) {
            if (tmp[i] != null) {
                table[i] = tmp[i];
            }
        }
        System.out.println("TABLE LENGTH now is: " + table.length);
    }

    public int getSize() { //gets the amount of students
        return size;
    }

    public Node getStudentKey(int key){ //gets a student key
        return table[hashFunction(key)].getStudentId(key);
    }

    public void insertKey(Node node) { //adds key record
        int position = hashFunction(node.getStudent().getStudentNumber());
        if (table[position] != null) { //if key busy
            if (table[position].searchList(node.getStudent().getStudentNumber())) { //if key exists
                System.out.println(" *** Attention, student " + node.getStudent().getStudentNumber() + " already inserted ***");
                return;
            }
        } else { //if key it's free
            table[position] = new List();
        }
        table[position].insertList(node.getStudent());
        size++;
        double loadFactor = (double) size / table.length;
        if (loadFactor > LOAD_FACTOR) {
            rehash();
        }
    }

    public void eraseKey(int key) { //deletes key record
        int pos = searchKey(key);
        if (pos != -1) {
            table[pos].eraseList(key);
            System.out.println("Deleted on Hash position: " + pos);
            size--;
        } else {
            System.out.println("\nNot found!");
        }
    }

    public void printKey() { //prints keys records
        for (int i=0; i<MAXSIZE; i++) {
            System.out.print("\nHASH[" + i + "] -> ");
            if (table[i] != null) {
                table[i].printList();
            }
            System.out.print(" null");
        }
        System.out.println();
    }

    public int searchKey(int key) { //search key record
        for (int i=0; i<MAXSIZE; i++) {
            if (table[i]!=null) {
                if ( table[i].searchList2(key) ) {
                    return i;
                }
            }
        }
        return -1;
    }

}
