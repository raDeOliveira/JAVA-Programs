package pt;
//IDE: IntelliJ@Jetbrains
//User: raOliveira
//Number: @ispg2019100463
//Date: 12/01/2021
//Time: 19:05
//Course: Informatic Engineering

import java.io.*;

public class FileClass {

    private BufferedReader fr;
    private BufferedWriter fw;

    public void openReading(String fileName ) throws IOException {
        fr = new BufferedReader(new FileReader(fileName) );
    }

    public void openWriting(String fileName) throws IOException {
        fw = new BufferedWriter(new FileWriter(fileName) );
    }

    public void closeWriting() throws IOException {
        fw.close();
    }

    public String readLine() throws IOException{
        return fr.readLine();
    }

    public void writeLine(String line) throws IOException{
        System.out.println( "Writing: " + line);
        fw.write(line, 0, line.length());
        fw.newLine();
    }

}
