package pt;
//IDE: IntelliJ@Jetbrains
//User: raOliveira
//Number: @ispg2019100463
//Date: 26/05/2021
//Time: 18:00
//Course: Computer Science and engineering

import java.io.*;
import java.util.*;

public class AddressBookDemo {

    // throws my exception
    static void customException(String a) throws TypeOnly4CharsException {
        if (a.length() > 4)
            throw new TypeOnly4CharsException(a);
    }

    // static variable for colors
    static Colours colour = new Colours();

    // main program
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        // array for contacts
        AddressBook addressBookArr = new AddressBook();

        // "ser." file that will receive the serialize data
        String serializeFile = "contacts.ser";

        // testing serialize/deserialize
        ContactDetails testeSerialize = new ContactDetails("Luke", "Gaia",913698523, "111");
        ContactDetails testeSerialize2 = new ContactDetails("Matador", "Benfica",914785236, "222");
        ContactDetails testeSerialize3 = new ContactDetails("Leia", "Portugal",996655884, "333");
        ContactDetails testeSerialize4 = new ContactDetails("Tigre", "SLB",985632024, "444");
        addressBookArr.addContact(testeSerialize.getName(), testeSerialize);
        addressBookArr.addContact(testeSerialize2.getName(), testeSerialize2);
        addressBookArr.addContact(testeSerialize3.getName(), testeSerialize3);
        addressBookArr.addContact(testeSerialize4.getName(), testeSerialize4);


        int option;
        do {
            System.out.println(colour.GREEN + "********************* Address Book App *********************" + colour.RESET);
            System.out.println("1 - Insert new contact");
            System.out.println("2 - Search contact");
            System.out.println("3 - Order contacts");
            System.out.println("4 - Remove contact");
            System.out.println("5 - Modify contact");
            System.out.println("6 - EXPORT/IMPORT contacts [SERIALIZE]");
            System.out.println("7 - SAVE/READ contacts to txt file");
            System.out.println("0 - EXIT program");
            option = input.nextInt();

            switch (option) {
                case 1:
                    // add contact
                    ContactDetails contact = new ContactDetails();
                    System.out.println("Type name: ");
                    contact.setName(input.next());
                    System.out.println("Type address: ");
                    contact.setAddress(input.next());

                    boolean flag = false;
                    // catching possible errors while typing phone number
                    do {
                        try {
                            System.out.println("Type phone number: ");
                            contact.setNumber(input.nextInt());
                            flag = true;

                            // TODO checked exception
                        } catch (InputMismatchException e) {
                            System.out.println("Can only have numbers!!" + e);
                            input.reset();
                            input.next();
                        }
                    } while (!flag);

                    // TODO my custom unchecked exception
                    boolean flag2 = false;
                    // catching possible errors while typing identification number
                    do {
                        try {
                            System.out.println("Type identification number: ");
                            String n = input.next();
                            customException(n);
                            contact.setIdentificationNumber(n);
                            flag2 = true;

                        } catch (TypeOnly4CharsException my) {
                            System.out.println(my);
                        }
                    } while (!flag2);

                    // add contact to addressBook
                    addressBookArr.addContact(contact.getName(), contact);
                    break;

                case 2:
                    // search contact
                    String contName;
                    if (!addressBookArr.getContacts().isEmpty()) {
                        System.out.println("Type name of contact to search: ");
                        contName = input.next();
                        System.out.println(addressBookArr.searchContact(contName));
                    } else {
                        System.out.println("Addressbook it's empty!!");
                    }
                    break;

                case 3:
                    // print sorted contacts
                    if (!addressBookArr.getContacts().isEmpty()) {
                        System.out.println(colour.RED + "******************* Existing contacts sorted *******************" + colour.RESET);
                        addressBookArr.sortContacts();
                    } else {
                        System.out.println("Addressbook it's empty!!");
                    }
                    break;

                case 4:
                    // remove contact
                    if (!addressBookArr.getContacts().isEmpty()) {
                        String nameCremove;
                        System.out.println("Type name of contact to remove: ");
                        nameCremove = input.next();
                        addressBookArr.removeContact(nameCremove);
                    } else {
                        System.out.println("Addressbook it's empty!!");
                    }
                    break;

                case 5:
                    // modify contact
                    if (!addressBookArr.getContacts().isEmpty()) {
                        ContactDetails newContact = new ContactDetails();
                        String nameModify;
                        System.out.println("Type name of contact to modify: ");
                        nameModify = input.next();
                        addressBookArr.removeContact(nameModify);
                        System.out.println("Type new name: ");
                        newContact.setName(input.next());
                        System.out.println("Type new address: ");
                        newContact.setAddress(input.next());

                        boolean flag3 = false;
                        // catching possible errors while typing phone number
                        do {
                            try {
                                System.out.println("Type new identification number: ");
                                newContact.setNumber(input.nextInt());
                                flag3 = true;

                                // TODO checked exception
                            } catch (InputMismatchException e) {
                                System.out.println("Can only have numbers!!" + e);
                                input.reset();
                                input.next();
                            }
                        } while (!flag3);

                        // TODO my custom unchecked exception
                        boolean flag4 = false;
                        // catching possible errors while typing identification number
                        do {
                            try {
                                System.out.println("Type new identification number: ");
                                String n = input.next();
                                customException(n);
                                newContact.setIdentificationNumber(n);
                                flag4 = true;

                            } catch (TypeOnly4CharsException my) {
                                System.out.println(my);
                            }
                        } while (!flag4);

                        addressBookArr.addContact(newContact.getName(), newContact);
                    } else {
                        System.out.println("Addressbook it's empty!!");
                    }
                    break;

                case 6:
                    int option2;
                    do {
                        System.out.println("1 - Export to file");
                        System.out.println("2 - Import from file");
                        System.out.println("0 - Back to root menu");
                        option2 = input.nextInt();

                        switch (option2) {
                            case 1:
                                // serialize file
                                addressBookArr.deserializeFile(serializeFile);
                                break;

                            case 2:
                                // deserialization to a new hashmap
                                addressBookArr.serializeFile(serializeFile);
                                break;
                        }
                    } while (option2 !=0);
                    break;

                case 7:
                    int option3;
                    do {
                        System.out.println("1 - SAVE to txt file");
                        System.out.println("2 - READ from txt file");
                        System.out.println("0 - Back to root menu");
                        option3 = input.nextInt();

                        switch (option3) {
                            case 1:
                                // save contact to txt file
                                addressBookArr.writeToTxt();
                                break;

                            case 2:
                                // read txt file
                                addressBookArr.readTxtFile();
                                break;

                        }
                    } while (option3 != 0);
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        } while (option != 0);

    }

}