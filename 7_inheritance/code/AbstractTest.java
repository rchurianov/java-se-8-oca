// AbstractTest.java
// Should produce compilation error on Dog(String breed) constructor
// package com.roman;

abstract class Animal {
    private String name;

    /* Java does not imply that a no argument
    * constructor exists for this class beacause a
    * constructor with parameter is specified explicitly
    */
    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Dog extends Animal {
    private String breed;

    Dog(String breed) { // this should produce compilation error
        // super(); <- inserted by Java since no explicit call to
        // instantiate parent class is made
        this.breed = breed;
    }

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Beagle");
        Dog dog2 = new Dog("Bubbly", "Poodle");
        System.out.println(dog1.getName() + ":" +
                            dog1.getBreed() + ":" +
                            dog2.getName() + ":" +
                            dog2.getBreed());
    }
}
