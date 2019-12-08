package Prob18;

/**
 * Author: Salman
 *
 * This class holds information read from file from each individual.
 */
public class PhoneBookEntry {

    private String number; //holds name
    private String name; //holds number
    private String street; //holds street address
    private String zip; //holds zip code
    private String city; //holds city name
    private String state; //holds state name

    /**
     * This constructor creates an object and assigns information obtained through arguments to its fields
     * @param name holds name
     * @param number holds number
     * @param street holds street address
     * @param zip holds zip code
     * @param city holds city name
     * @param state holds state name
     */
    public PhoneBookEntry(String name, String number, String street, String zip, String city, String state){
        this.name = name;
        this.number = number;
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }

    /**
     * gets name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * sets name
     * @param name receives name to be overwritten
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets number
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * sets number
     * @param number receives number to be overwritten
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * gets street address
     * @return street address
     */
    public String getStreet() {
        return street;
    }


    /**
     * sets street address
     * @param street receives street address to be overwritten
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * gets zip code
     * @return zip code
     */
    public String getZip() {
        return zip;
    }

    /**
     * sets zip code
     * @param zip receives zip code to be overwritten
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * gets city name
     * @return city name
     */
    public String getCity() {
        return city;
    }

    /**
     * sets city name
     * @param city receives city name to be overwritten
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * gets state name
     * @return state name
     */
    public String getState() {
        return state;
    }

    /**
     * sets state name
     * @param state receives state name to be overwritten
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Returns a printable string containing all the entries for a single record
     * @return printable and formatted entry
     */
    public String toString (){
        return String.format("%-25s%-25s%-25s%-25s%-25s%-25s\n", number, name, street, zip, city, state);
    }

}
