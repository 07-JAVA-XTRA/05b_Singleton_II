package com.cc.java;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
		
        Controller controller = Controller.getInstance();

		// Namenslisten --> Arrays
		String [] catNames = {"Grizabella","Alonzo","RumTumTugger","Suzanne"};
		String [] dogNames = {"Fifi","Boo","Cassie","Bonzo"};

        for (int i = 0; i < catNames.length; i++) {
           controller.addNewCat(catNames[i]); 
        }

        for (int i = 0; i < dogNames.length; i++) {
           controller.addNewDog(dogNames[i]);
        }

        output(controller.getRandomDog().askACat());
        output(controller.getRandomCat().askACat());
        

       
	}

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}
