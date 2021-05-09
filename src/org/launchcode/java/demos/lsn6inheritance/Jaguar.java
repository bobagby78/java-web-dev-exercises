package org.launchcode.java.demos.lsn6inheritance;

public class Jaguar extends Cat {
    private String name;
    private String species = "Felis catus";

    public Jaguar(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

//    public String purr() {
//        return "I'm a HouseCat";
//    }

    public String chuff() {return "I grunt (chuff) instead of purring"}
}