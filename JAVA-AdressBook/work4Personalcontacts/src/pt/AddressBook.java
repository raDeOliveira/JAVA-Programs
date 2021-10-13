package pt;
//IDE: IntelliJ@Jetbrains
//User: raOliveira
//Number: @ispg2019100463
//Date: 26/05/2021
//Time: 17:59
//Course: Computer Science and engineering

import java.io.*;
import java.util.*;

public class AddressBook extends ContactDetails {

    // colors variable
    static Colours colour = new Colours();

    // hasmap to store contacts
    private static final HashMap<String, ContactDetails> contacts = new HashMap<>();

    // get all contacts
    public HashMap<String, ContactDetails> getContacts() {
        return contacts;
    }

    // add contact
    public void addContact(String name, ContactDetails contact) {
        contacts.put(name.toUpperCase(Locale.ROOT), contact);
    }

    // remove contact
    public void removeContact(String name) {
        contacts.remove(name.toUpperCase(Locale.ROOT));
    }

    // search contact
    public ContactDetails searchContact(String name) {
        return contacts.get(name.toUpperCase(Locale.ROOT));
    }

    // modify contact
    public void modifyContact(String name, ContactDetails contact) {
        contacts.replace(name, contact);
    }

    // sort contacts
    public void sortContacts() {
        // treeMap to store values of HashMap
        TreeMap<String, ContactDetails> sorted = new TreeMap<>();

        // copy all data from hashMap into treeMap
        sorted.putAll(contacts);

        // display the TreeMap which is naturally sorted
        for (Map.Entry<String, ContactDetails> entry : sorted.entrySet())
            System.out.println("Contact: " + entry.getValue());
    }

    // serialize file
    public void serializeFile(String serializeFile) {
        HashMap<String, ContactDetails> newHashMap;

        try {
            FileInputStream fileInput = new FileInputStream(serializeFile);

            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
            newHashMap = (HashMap)objectInput.readObject();

            objectInput.close();
            fileInput.close();
        } catch (IOException i) {
            System.out.println("IOException is caught " + i);
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("ClassNotFoundException is caught " + c);
            return;
        }

        System.out.println(colour.BLUE + "***************** Deserializing  contacts.ser file... *****************" + colour.RESET);

        for(Map.Entry<String, ContactDetails> entry : newHashMap.entrySet()) {
            ContactDetails deserializeContact = entry.getValue();
            System.out.println("Contact details: " + deserializeContact);
        }
    }

    // deserialize file
    public void deserializeFile(String serializeFile) {
        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(serializeFile);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(contacts);

            out.close();
            file.close();
            System.out.println("Object has been serialized");

        } catch(FileNotFoundException ex) {
            System.out.println("IOException is caught" + ex);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // save contacts numbers only, to txt file
    public void writeToTxt() {

        // new file object
        File file = new File("contacts.txt");
        BufferedWriter bf = null;

        try {
            // create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(file));

            // iterate map entries
            for (Map.Entry<String, ContactDetails> entry : contacts.entrySet()) {

                // put key and value separated by a colon
                bf.write(entry.getKey() + ":" + entry.getValue().getNumber());

                // new line
                bf.newLine();

            }
            // flush characters from the buffered writer
            bf.flush();
            System.out.println("Contacts successfully saved to the 'contacts.txt' file.");
        } catch (IOException e) {
            System.out.println("An error occurred " + e);
        }
    }

    // read contacts from txt file
    public void readTxtFile() {
            try {
            File myObj = new File("contacts.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred " + e);
        }
    }
}