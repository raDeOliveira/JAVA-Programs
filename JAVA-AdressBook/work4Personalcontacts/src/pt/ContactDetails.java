package pt;
//IDE: IntelliJ@Jetbrains
//User: raOliveira
//Number: @ispg2019100463
//Date: 26/05/2021
//Time: 18:00
//Course: Computer Science and engineering

import java.io.Serializable;
import java.util.Locale;

public class ContactDetails implements Serializable {

    private String name;
    private String address;
    private int number;
    // string because can use drivers license or other type of document
    private String identificationNumber;

    public ContactDetails() {
    }

    public ContactDetails(String name, String address, int number, String identificationNumber) {
        this.name = name.toUpperCase(Locale.ROOT);
        this.address = address;
        this.number = number;
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase(Locale.ROOT);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    @Override
    public String toString() {
        return "Name ='" + name + '\'' +
                ", address ='" + address + '\'' +
                ", number =" + number +
                ", identificationNumber=" + identificationNumber;
    }


}
