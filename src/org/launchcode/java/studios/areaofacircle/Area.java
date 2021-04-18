package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;

        System.out.println("Rounded to one decimal place (EX: 4.2), what is the radius of the circle?: ");
        radius = input.nextDouble();
        input.close();
        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is " + area);
    }

}
