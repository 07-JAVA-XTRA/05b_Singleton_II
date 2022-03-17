package com.cc.java;

public class Dog extends Pet {

    private String name;
    private Controller controller;

    public Dog(String name) {
        this.name = name;
        this.controller = Controller.getInstance();
    }

    @Override
    public String petSounds() {
        return name + " says: Bark!";
    }

    public String askACat() {
        return controller.getRandomCat().getName(this, name);
    }

}
