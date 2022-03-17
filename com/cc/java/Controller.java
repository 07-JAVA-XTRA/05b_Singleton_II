package com.cc.java;

import java.util.ArrayList;
import java.util.Random;

public class Controller {
   
    /** Objektbildung */

    private static Controller instance;

    private Controller(){
        this.catsL = new ArrayList<>();
        this.dogsL = new ArrayList<>();
        this.random = new Random();
    }
    
    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    /** Funktionalität */

    private ArrayList<Cat> catsL;
    private ArrayList<Dog> dogsL;
    private Random random;

   
   
    

}
