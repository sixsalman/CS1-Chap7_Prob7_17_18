package Prob17;

import java.util.Scanner; //util package's Scanner class imported
import java.io.*; //whole of io package imported

/**
 *  Author: Salman
 *
 *  This program gets an array from user and gives user a list of options to obtain certain results from the array.
 */
public class Prob17 {

    /**
     * gets inputs from user and processes them appropriately.
     * @param args is not used
     * @exception IOException as Scanner reads from a file and can throw an exception in the file does not exist
     */
    public static void main(String[] args) throws IOException {

        String fName;
        //files read and stored
        for(int i = 1; i <= 3; i++) {
            fName = "ArrayOperations" + i + ".txt";
            File file = new File(fName);
            Scanner data = new Scanner(file); //Scanner data created to read from file

            int nCols = data.nextInt();
            int nRows = data.nextInt();

            int[][] arrOne = new int[nRows][nCols];

            for (int j = 0; j < arrOne.length; j++) {
                for (int k = 0; k < (arrOne[j]).length; k++) {
                    arrOne[j][k] = data.nextInt();
                }
            }

            System.out.println(fName + " has been read");

            System.out.println("Enter 1 to get total\n2 to get average\n3 to get row total\n4 to get column total\n" +
                    "5 to get highest value in a row\n6 to get lowest value in a row");

            ArrayOperations one = new ArrayOperations(arrOne);

            Scanner kbd = new Scanner(System.in);

            disp(one, kbd.nextInt(), kbd);
        }

    }

    /**
     * gets user desired result and displays it.
     * @param mat gets a Moatrix type object
     * @param choice gets user's choice
     * @param kbd gets the variable referring scanner so this method could read inputs
     */
    public static void disp(ArrayOperations mat, int choice, Scanner kbd){
        switch (choice){
            case 1:
                System.out.println(mat.getTotal());
                break;
            case 2:
                System.out.println(mat.getAverage());
                break;
            case 3:
                System.out.print("Enter row no.: ");
                System.out.println(mat.getRowTotal(kbd.nextInt()));
                break;
            case 4:
                System.out.print("Enter column no.: ");
                System.out.println(mat.getColumnTotal(kbd.nextInt()));
                break;
            case 5:
                System.out.print("Enter row no.: ");
                System.out.println(mat.getHighestInRow(kbd.nextInt()));
                break;
            case 6:
                System.out.print("Enter row no.: ");
                System.out.println(mat.getLowestInRow(kbd.nextInt()));
                break;
                default:
                    System.out.println("Invalid Entry");
        }
    }

}
