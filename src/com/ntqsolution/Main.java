package com.ntqsolution;

import com.ntqsolution.entity.Animals;
import com.ntqsolution.entity.Cows;
import com.ntqsolution.entity.Horses;
import com.ntqsolution.service.RunThread;
import com.ntqsolution.utils.Const;

public class Main {

    public static void main(String[] args) {
        // write your code here
        start(new Horses("Horse"));
        start(new Cows("Cow"));
    }

    private static void start(Animals animal) {
        RunThread thread = new RunThread(animal);
        thread.start();
    }

//    private static void start(String name) {
//        Horses horse = new Horses(name);
//        RunThread thread = new RunThread(horse);
//        thread.start();
//    }

}
