package com.cc.java;

public class Cat extends Pet {

    private String name;
    private Controller controller;

    public Cat(String name) {
        this.name = name;
        this.controller = Controller.getInstance();
    }

    @Override
    public String petSounds() {
        return name + " says: Meeeeow!";
    }

    public String askACat() {
        return controller.getRandomCat().getName(this, name);
    }

    public String getName(Pet pet, String caller) {
        if (pet instanceof Cat) // wenn pet eine Katze ist
        {
            return "Hi " + caller + ", I am " + name + ".";
        } else {
            return "Sorry " + caller + ", you're a dog!";
        }
    }

}
