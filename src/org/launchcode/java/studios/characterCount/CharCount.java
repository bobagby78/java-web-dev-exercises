package org.launchcode.java.studios.characterCount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCounter = new HashMap<>(); //Init a hashmap: Character (each letter of the given string), Integer (the number of times that Character pops up in the string)
        String hiddenFigs;                                              //Declare and empty String. This could have been omitted by initializing the string upon declaration. Whatevs.

        hiddenFigs = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] hiddenFigsCharacters = hiddenFigs.toCharArray();         //init an array, which is the string, turned into an array.
        for (char character : hiddenFigsCharacters){                    //loop- for each character in the array called hiddenFigsCharacters...
            if (characterCounter.containsKey(character)){               // If the characterCounter HashMap already contains the character...
                characterCounter.put(character, characterCounter.get(character) + 1);   //put the character back in and increase its count by 1
            }else{
                characterCounter.put(character, 1);                     //otherwise, put the character in there and give it the base value of 1
            }


        }
        for (Map.Entry<Character, Integer> aCharacter : characterCounter.entrySet()){  //looping through the hashmap- for each character in the entrySet...
            System.out.println(aCharacter.getKey() + " : " + aCharacter.getValue());   //print out the KEY (character) followed by the VALUE(count), with a colon in between.
        }
    }
}

