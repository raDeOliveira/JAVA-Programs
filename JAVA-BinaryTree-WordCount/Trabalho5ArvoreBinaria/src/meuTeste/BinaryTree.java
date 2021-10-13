package meuTeste;
//IDE: IntelliJ@Jetbrains
//User: raOliveira
//Number: @ispg2019100463
//Date: 31/12/2020
//Time: 19:06
//Course: Informatic Engineering

import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import static java.lang.System.*;

public class BinaryTree {

    //variable to store total words
    static int totalWords = 0;

    //defines root node
    public static Node root = null;

    //separator
    public static void separator() {
        char x = '=';
        char[] separator = new char[50];
        Arrays.fill(separator, x);
        out.println(separator);
    }

    //insert node method
    public static Node insertNode(Node node, String word, int line){
        if(node == null){
            node = new Node();
            //inserts word in root node and defines the line wich word appears
            node.setData(word.toLowerCase(), line);
            node.setLeft(null);
            node.setRight(null);
        } else {
            if (word.toLowerCase().compareTo(node.toString()) < 0){
                //if word it's smaller then the one in current node, call the method insertNode
                //and put word in left child node case it's null
                node.setLeft( insertNode( node.getLeft(), word, line));
            } else {
                if (word.toLowerCase().compareTo(node.toString()) > 0) {
                    //if word it's smaller then the one in current node, call the method insertNode
                    //and put word in right child node case it's null
                    node.setRight(insertNode(node.getRight(), word, line));
                } else {
                    //if word exists adds + 1 to the counter
                    node.setRepetitions();
                    //sends to the arrayList the line number that word appears, if not already exists
                    if (!node.getArrayList().contains(line))
                        node.setArrayList(line);
                }
            }
        }
        return node;
    }

    //pre order print
    public static void preOrder(Node node) {
        if (node != null) {
            System.out.println("Word '" + node + "', appears " + node.getRepetitions() + " time(S)");
            out.println("Number of the line: " + node.getArrayList());
            separator();

            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    //in order print
    public static void inOrder(Node node){
        if(node != null){
            inOrder(node.getLeft());

            System.out.println("Word '" + node + "', appears " + node.getRepetitions() + " time(S)");
            out.println("Number of the line: " + node.getArrayList());
            separator();

            inOrder(node.getRight());
        }
    }

    //pos order print
    public static void posOrder(Node node){
        if(node!= null){
            posOrder(node.getLeft());
            posOrder(node.getRight());

            System.out.println("Word '" + node + "', appears " + node.getRepetitions() + " time(S)");
            out.println("Number of the line: " + node.getArrayList());
            separator();
        }
    }

    //counts tree levels
    public static int countTreeLevels(Node node){
        if(node == null){
            return 0;
        } else {
            //counts left tree nodes
            int left = countTreeLevels(node.getLeft());
            //counts right tree levels
            int right = countTreeLevels(node.getRight());
            //ternary operator that returns 1+left case left it's bigger than right, and vice-versa
            return left > right ? 1 + left : 1 + right;
        }
    }

    //counts tree nodes
    public static int countTreeNodes(Node node){
        if(node == null){
            return 0;
            //returns 1 case root node isn't null
        } else {
            return 1 + countTreeNodes(node.getLeft()) + countTreeNodes(node.getRight());
        }
    }

    //search word
    public static void searchWord(Node node, String word) {
        if (node != null){
            searchWord(node.getLeft(), word);
            searchWord(node.getRight(), word);
            if (node.toString().compareToIgnoreCase(word) == 0) {
                System.out.println("Word '" + node + "', appears " + node.getRepetitions() + " time(S)");
                out.println("Number of the line: " + node.getArrayList());
            }
        }
    }

    //counts left side nodes
    public static int countLeftSideNodes(Node node){
        int leftNode = 0;
        leftNode = countTreeNodes(node.getLeft());
        return leftNode;
    }

    //counts right side nodes
    public static int countRightSideNodes(Node node){
        int rightNode =0;
        rightNode = countTreeNodes(node.getRight());
        return rightNode;
    }

    //characters count method
    public static String charactersCount() throws IOException {
        FileClass f2 = new FileClass();
        f2.openReading("teste.txt");
        String lineChar;
        int characterCount = 0; //counter for the characters

        while((lineChar = f2.readLine()) != null) {
            if(lineChar.equals("")) {
                continue;
            } else {
                characterCount += lineChar.length();
            }
        }
        return characterCount + " characters.";
    }

    //results
    public static void results() throws IOException {
        out.println();
        System.out.println("File has a total of " + totalWords + " words, [" + countTreeNodes(root) +
                " different words] and " + charactersCount());

        System.out.println("Also, the tree as " + countTreeLevels(root) + " levels, " +
                + countLeftSideNodes(root) + " left side nodes and " + countRightSideNodes(root) + " right side nodes.");
    }

    //main code
    public static void mainCode()throws IOException {

        FileClass f1 = new FileClass();
        String line;
        int cont = 0;
        String word;
        //array to remove special characters
        String []pontuacao = new String[]{"\"","'","(",")","[","]",".",",",";",":","..."};

        f1.openReading("teste.txt");
        do {
            line = f1.readLine(); //starts reading text line
            cont++;

            if (line != null){
                StringTokenizer wordToken = new StringTokenizer(line);
                while (wordToken.hasMoreTokens()) {
                    //passes word from next token to variable
                    word = wordToken.nextToken();
                    totalWords++;

                    for (String s : pontuacao) { //removes pontuation before inserts in the node
                        word = word.replace(s, "");
                    }
                    root = insertNode(root, word, cont);
                }
            }
        } while (line != null);

        int option;
        do {
            out.println("**************************************************");
            out.println("********************** MENU **********************");
            out.println("**************************************************");
            out.println("1 - Show tree by PRE ORDER view");
            out.println("2 - Show tree by IN ORDER view");
            out.println("3 - Show tree by POS ORDER view");
            out.println("4 - Search word");
            out.println();
            out.println("9 - Exit");

            option = Read.oneInt();
            switch (option) {
                case 1:
                    preOrder(root);
                    results();
                    break;

                case 2:
                    inOrder(root);
                    results();
                    break;

                case 3:
                    posOrder(root);
                    results();
                    break;

                case 4:
                    separator();
                    out.println("Type word: ");
                    String wordSearch = Read.oneString();
                    searchWord(root, wordSearch);
                    break;

                case 9:
                    out.println("EXIT!");
                    break;

                default:
                    out.println("Invalid option!");
            }
        } while (option != 9);
    }

    public static void main(String[] args) throws IOException {

        //starts the program
        mainCode();

    }
}