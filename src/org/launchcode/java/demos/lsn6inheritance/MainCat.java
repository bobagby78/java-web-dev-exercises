package org.launchcode.java.demos.lsn6inheritance;

public class MainCat {
    public static void main(String[] args) {

        HouseCat ziggy = new HouseCat("Ziggy", 5);
        Jaguar jiggy = new Jaguar("Jiggy", 60);
        Bobcat biggy = new Bobcat("biggy", 8);
        /*
        Cat ziggy = new HouseCat("Ziggy", 5); Casting example: All these are viable instantiations, but are NOT equal to the original 3 instantiations. Since each subclass extends Cat, they are all technically of type Cat
        Cat jiggy = new Jaguar("Jiggy", 60);      BUT BE CAREFUL- if you instantiate as Cat, it will get all of Cat's methods, but it won't get HouseCat's methods. all housecats are cats, but not all cats are housecats
        Cat biggy = new Bobcat("biggy", 8);           -WILL throw a runtime exception, which won't be caught by the compiler before you run the prog
        */

        jiggy.isTired();
        System.out.println(jiggy.isTired());
        System.out.println(jiggy.isTired());
        jiggy.eat();
        System.out.println(jiggy.isTired());
        jiggy.sleep();
        System.out.println(jiggy.isTired());
        ziggy.setWeight(16);
        System.out.println(ziggy.getWeight());


    }
}
