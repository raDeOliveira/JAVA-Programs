package meuTeste;
//IDE: IntelliJ@Jetbrains
//User: raOliveira
//Number: @ispg2019100463
//Date: 31/12/2020
//Time: 16:13
//Course: Informatic Engineering

import java.io.*;

class FileClass {

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
