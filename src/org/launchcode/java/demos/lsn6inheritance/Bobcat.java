package org.launchcode.java.demos.lsn6inheritance;

public class Bobcat extends Cat{

    private String name;
    private String species = "Panthera onca";

    public Bobcat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }
}
