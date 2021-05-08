package org.launchcode.java.studios.characterCount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCounter = new HashMap<>();
        String hiddenFigs;

        hiddenFigs = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] hiddenFigsCharacters = hiddenFigs.toCharArray();
        for (char character : hiddenFigsCharacters){
            if (characterCounter.containsKey(character)){
                characterCounter.put(character, characterCounter.get(character) + 1);
            }else{
                characterCounter.put(character, 1);
            }


        }
        for (Map.Entry<Character, Integer> aCharacter : characterCounter.entrySet()){
            System.out.println(aCharacter.getKey() + " : " + aCharacter.getValue());
        }
    }
}

