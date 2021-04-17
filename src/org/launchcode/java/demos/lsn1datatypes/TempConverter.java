package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner; //Scanner takes primitives and creates non-primitives.
/*by importing the java.util.Scanner, we can use the abbrev name Scanner later. can use java.util.scanner without
importing, just have to call it by its full name */

public class TempConverter { //public tells the prog that this is a globally visible class.
    public static void main(String[] args) { //static says this is a one-time use method, not an instantiation of a class.
        double fahrenheit; //double is a decimal up to 16 places
        double celsius;
        Scanner input; //Scanner class is used to *scan* for input from a user.

        input = new Scanner(System.in); //accepts input from user and stores as var input
        System.out.println("What be the temp in degF?: "); //shows the prompt we use to get the info
        fahrenheit = input.nextDouble();// fahrenheit var is whatever the user inputs
        input.close();//closes the input Scanner "session" after it does what it needs to do

        celsius = (fahrenheit - 32) * 5/9;  //conversion formula takes the input, converts, saves as celsius
        System.out.println("The temperature in Celsius is: " + celsius + "°C"); //output to show the conversion to user
    }
}
