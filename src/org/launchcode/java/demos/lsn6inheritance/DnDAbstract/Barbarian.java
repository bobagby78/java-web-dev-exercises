package org.launchcode.java.demos.lsn6inheritance.DnDAbstract;


import java.util.ArrayList;

public class Barbarian extends DnDBaseChar{
    String primAbility = "strength";
    int hitDie = 12;

    Barbarian(String name, Integer charLevel, Integer exp, Integer hp, String save1, String save2){
        super(name, charLevel, exp, hp, save1, save2);
    }

}

