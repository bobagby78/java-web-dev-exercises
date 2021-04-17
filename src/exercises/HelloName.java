package exercises;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String name;

        System.out.println("What is your name?: ");
        name = input.nextLine();
        input.close();
        System.out.println("Hello, " + name);
    }
}
