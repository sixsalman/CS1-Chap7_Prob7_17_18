package Prob7;

import java.util.*; //all of util package imported
import java.io.*; //all of io package imported

/**
 * Author: Salman
 *
 * This program asks user for a yes or no question and outputs a randomly generated response.
 */
public class Prob7 {

    /**
     * 	Main handles the driver code for the program. Inputs are taken in this method
     * 	and processed. The output A is printed to the console here.
     * @param args is not used
     * @throws IOException as Scanner reads from a file and can throw an exception in the file does not exist
     */
    public static void main(String[] args) throws IOException {

        File file = new File("8ball.txt");
        Scanner eightBall = new Scanner(file); //Scanner data created to read from file

        ArrayList<String> resps = new ArrayList<>(); //ArrayList created to hold entries

        //entries read and stored
        while(eightBall.hasNext()){
            resps.add(eightBall.nextLine());
        }

        Scanner kbd = new Scanner(System.in); //Scanner kbd created to read input from user

        Magic8Ball disp; //holds reference to a Magic8Ball object
        String userEntry; //hold user's entry

        do {
            System.out.println("Enter a yes or no question:");
            kbd.nextLine();
            disp = new Magic8Ball(resps);
            System.out.println(disp.getResp());
            System.out.println("Enter quit to stop asking questions or enter any other phrase to continue doing so:");
            userEntry = kbd.nextLine();
        }while(!(userEntry.equals("quit")));

    }

}
