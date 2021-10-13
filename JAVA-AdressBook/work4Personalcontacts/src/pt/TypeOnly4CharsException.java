package pt;
//IDE: IntelliJ@Jetbrains
//User: raOliveira
//Number: @ispg2019100463
//Date: 27/05/2021
//Time: 00:06
//Course: Computer Science and engineering

/**
 *
 * My custom checked exception @rAoliveira
 *
 */

public class TypeOnly4CharsException extends Exception {

    String n;

    public TypeOnly4CharsException(String number) {
        n = number;
    }

    public String toString() {
        return "TypeOnly4CharsException[" + n + "]";
    }

}