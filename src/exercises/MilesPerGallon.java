package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        double miles;
        double gallons;

        System.out.println("How many miles have you driven? ");
        miles = input.nextFloat();
        System.out.println("How many gallons have you burned? ");
        gallons = input.nextFloat();
        input.close();

        double mileage = miles/gallons;
        System.out.println("Your current gas mileage is " + mileage + " miles per gallon");
    }

}
