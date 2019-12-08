package Prob17;

/**
 * Author: Salman
 *
 * This class receives an array and has methods that abstract desired information from it.
 */
public class ArrayOperations {

    private int[][] arr; //holds the array

    /**
     * assigns the received array to its field
     * @param arr gets the array
     */
    public ArrayOperations(int[][] arr){
        this.arr = arr;
    }

    /**
     * gets total
     * @return total
     */
    public int getTotal (){
        int tot = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < (arr[i]).length; j++){
                tot += arr[i][j];
            }
        }
        return tot;
    }

    /**
     * gets average
     * @return average
     */
    public int getAverage (){
        int tot = 0;
        int nEntries = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < (arr[i]).length; j++){
                tot += arr[i][j];
                nEntries++;
            }
        }
        return (tot/nEntries);
    }

    /**
     * gets total for a row
     * @param row gets row number
     * @return total of a row
     */
    public int getRowTotal (int row){
        int tot = 0;
        for(int i = 0; i < arr[row].length; i++){
                tot += arr[row][i];
        }
        return tot;
    }

    /**
     * gets total for a column
     * @param col gets column number
     * @return total of a column
     */
    public int getColumnTotal (int col){
        int tot = 0;
        for(int i = 0; i < arr.length; i++){
                tot += arr[i][col];
        }
        return tot;
    }

    /**
     * gets highest number in a row
     * @param row gets a row number
     * @return highest number from a row
     */
    public int getHighestInRow (int row){
        int max = arr[row][0];
        for(int i = 1; i < arr[row].length; i++){
            if (arr[row][i] > max)
                max = arr[row][i];
        }
        return max;
    }

    /**
     * gets lowest number in a row
     * @param row gets a row number
     * @return lowest number from a row
     */
    public int getLowestInRow (int row){
        int min = arr[row][0];
        for(int i = 1; i < arr[row].length; i++){
            if (arr[row][i] < min)
                min = arr[row][i];
        }
        return min;
    }


}
