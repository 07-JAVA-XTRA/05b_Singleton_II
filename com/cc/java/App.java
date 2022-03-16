package com.cc.java;

public class App {
  public static void main(String[] args) {
		
		// Namenslisten --> Arrays
		String [] catNames = {"Grizabella","Alonzo","RumTumTugger","Suzanne"};
		String [] dogNames = {"Fifi","Boo","Cassie","Bonzo"};

        Cat cat = new Cat(catNames[0]);
        output(cat.petSounds());
        
        Dog dog = new Dog(dogNames[0]);
        output(dog.petSounds());
	}

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}
