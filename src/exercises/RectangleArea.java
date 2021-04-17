package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        float length;
        float width;

        System.out.println("What is the length of the rectangle? Use float format (##.#): ");
        length = input.nextFloat();
        System.out.println("What is the width of the rectangle? Use float format (##.#): ");
        width = input.nextFloat();
        input.close();
        float rectArea = width * length;
        System.out.println("The area of your rectangle is " + rectArea);
    }
}
