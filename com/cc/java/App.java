package com.cc.java;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
		
        Controller c1 = Controller.getInstance();
        output("c1: " + c1);
        Controller c2 = Controller.getInstance();
        output("c2: " + c2);

        
		// Namenslisten --> Arrays
		String [] catNames = {"Grizabella","Alonzo","RumTumTugger","Suzanne"};
		String [] dogNames = {"Fifi","Boo","Cassie","Bonzo"};

        ArrayList<Cat> catsL = new ArrayList<>();
        ArrayList<Dog> dogsL = new ArrayList<>();
        // output("Test: " + catsL);

        // for (int i = 0; i < catNames.length; i++) {
        //     catsL.add(new Cat(catNames[i])); 
        // }

        // for (int i = 0; i < dogNames.length; i++) {
        //     dogsL.add(new Dog(dogNames[i])); 
        // }

        // output("Test: " + catsL)
        // output(catsL.get(0).petSounds());

       
	}

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}
