package com.cc.java;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
		
		// Namenslisten --> Arrays
		String [] catNames = {"Grizabella","Alonzo","RumTumTugger","Suzanne"};
		String [] dogNames = {"Fifi","Boo","Cassie","Bonzo"};

        ArrayList<Cat> catsL = new ArrayList<>();
        output("Test: " + catsL);

        for (int i = 0; i < catNames.length; i++) {
            catsL.add(new Cat(catNames[i])); 
        }

        output("Test: " + catsL);
        output(catsL.get(0).petSounds());

        // Cat cat = new Cat(catNames[0]);
        // output(cat.petSounds());
        
        // Dog dog = new Dog(dogNames[0]);
        // output(dog.petSounds());
	}

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}
