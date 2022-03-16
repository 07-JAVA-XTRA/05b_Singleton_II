package com.cc.java;

public class Cat extends Pet{

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String petSounds() {
        return name + " says: Meeeeow!";
    }

    public String getName() {
        return name;
    }



}
