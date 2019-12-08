package Prob18;

import java.io.*; //all of io package imported
import java.util.*; //all of util package imported

/**
 * Author: Salman
 *
 * This program reads information from a file, stores it in an array in form of objects and then prints it
 */
public class Prob18 {

    /**
     * gets inputs from user and processes them appropriately.
     * @param args is not used
     * @exception IOException as Scanner reads from a file and can throw an exception in the file does not exist
     */
    public static void main(String[] args) throws IOException {

        File file = new File("PhoneBook.txt");
        Scanner data = new Scanner(file); //Scanner data created to read from file

        ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>(); //ArrayList created to hold entries in form of objects

        data.nextLine();

        //reads and stores data from file
        while(data.hasNext()){
            phoneBook.add(new PhoneBookEntry(data.next(), data.next(), data.next(), data.next(), data.next(), data.next()));
        }

        data.close();

        System.out.printf("Entries in Phone Book:\n%-25s%-25s%-25s%-25s%-25s%-25s\n", "Phone#", "Name", "Street",
                "Zip", "City", "State/Province");

        //all the entries printed from ArrayList phoneBook
        for (PhoneBookEntry print: phoneBook){

            System.out.print(print);

        }

    }

}
