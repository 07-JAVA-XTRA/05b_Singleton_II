package com.cc.java;

public class Cat extends Pet{

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
        return controller.getRandomCat().getName();
    }

    public String getName() {
        return name;
    }



}
