package Prob7;

import java.util.*; //all of util package imported

/**
 * Author: Salman
 *
 * This class serves as a blueprint for an object which receives an array with multiple responses, selects one of them
 * and has a getter method through which tht response can be accessed
 */
public class Magic8Ball {

    private String resp; //holds a selected response

    /**
     * This constructor receives an array of responses, chooses one of them and assigns it to a field of the
     * instance of this class
     * @param resps receives an array with multiple responses
     */
    public Magic8Ball(ArrayList<String> resps){
        Random rand = new Random(); //Random rand created to be used to generate a random integer
        resp = resps.get(rand.nextInt(resps.size()));
    }

    /**
     * gets response
     * @return a response
     */
    public String getResp() {
        return resp;
    }
}
