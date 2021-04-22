package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                        "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                        "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        String searchTerm;

        System.out.println("Give me a search term for the first sentence of \"Alice\" " );
        searchTerm = input.nextLine().toLowerCase();
        input.close();
        if (alice.toLowerCase().contains(searchTerm)){
            System.out.print("The first occurence of that term is at index " + alice.indexOf(searchTerm) + ". ");
            String searchTermRemovedStart = alice.substring(0,alice.indexOf(searchTerm)) + "*HERE IT WAS*";
            String searchTermRemovedEnd = alice.substring(alice.indexOf(searchTerm) + searchTerm.length());
            System.out.println(searchTermRemovedStart + searchTermRemovedEnd);
        }else{
            System.out.println("That term is not in this part of the text.");
        }

    }
}
