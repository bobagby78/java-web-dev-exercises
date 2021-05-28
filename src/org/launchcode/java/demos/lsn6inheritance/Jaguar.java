package org.launchcode.java.demos.lsn6inheritance;

public class Jaguar extends Cat {
    private String name;
    private String species = "Panthera onca";

    public Jaguar(String aName, double aWeight) {
        super(aWeight); //Gots to be first in the fields since it's a super.
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "RRRRAAAAAWWWWWRRRRR";
    }

//    public String purr() {
//        return "I'm a HouseCat";
//    }
    @Override
    public String purr() {return "Jaguars don't purr, they 'chuff'";}


}