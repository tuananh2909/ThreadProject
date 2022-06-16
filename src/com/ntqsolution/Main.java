package com.ntqsolution;

import com.ntqsolution.entity.Chickens;
import com.ntqsolution.entity.Cows;
import com.ntqsolution.entity.Horses;
import com.ntqsolution.utils.Const;
import com.ntqsolution.utils.ThreadUtil;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        start(new Horses("Horse"));
//        start(new Cows("Cow"));
//        Queue<Animals> animalsQueue = new LinkedList<>();
//        for (int i = Const.DEFAULT; i <= Const.TOTAL_ANIMAL; i++) {
//            animalsQueue.add(new Horses("Ngựa " + i));
//            animalsQueue.add(new Cows("Bò " + i));
//            animalsQueue.add(new Chickens("Gà " + i));
//            process(animalsQueue);
//        }
        Horses horse = new Horses("Horse");
        Cows cow = new Cows("Cow");
        Chickens chicken = new Chickens("Chicken");

        for (int i = Const.DEFAULT; i <= Const.TOTAL_ANIMAL; i++) {
            Container.add(horse);
            Container.add(cow);
            Container.add(chicken);

            ThreadUtil.start();
        }

    }

//    private static void start(Animals animal) {
////        RunThread thread = new RunThread(animal);
////        thread.start();
//        RunThreadFactory factory = new RunThreadFactory();
//        RunThread thread = factory.getAnimalThread(animal);
//        thread.start();
//    }

//    private static void start(String name) {
//        Horses horse = new Horses(name);
//        RunThread thread = new RunThread(horse);
//        thread.start();
//    }

//    private static void process(Queue queue) {
//        for (Object animal : queue) {
//            start((Animals) animal);
//        }
//        ThreadUtil.sleep(3000);
//    }

}
