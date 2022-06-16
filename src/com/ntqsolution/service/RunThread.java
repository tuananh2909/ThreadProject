package com.ntqsolution.service;

import com.ntqsolution.Container;
import com.ntqsolution.entity.Animals;
import com.ntqsolution.entity.Chickens;
import com.ntqsolution.entity.Cows;
import com.ntqsolution.entity.Horses;
import com.ntqsolution.utils.ThreadUtil;

public class RunThread extends Thread {

    //    public Animals animals;
//
////    private int destination;
//
//    public RunThread(Animals animals) {
//        this.animals = animals;
////        if (animals instanceof Horses) {
////            destination = Const.HORSE_DESTINATION;
////        } else {
////            destination = Const.COW_DESTINATION;
////        }
//    }
//
    @Override
    public void run() {
        while (Container.getSize() != 0) {
            Animals animals = Container.pollAnimal();
            AnimalProcessor processor = null;
            if (animals instanceof Horses) {
                processor = new HorseProcessor(animals);
            } else if (animals instanceof Cows) {
                processor = new CowProcessor(animals);
            } else if (animals instanceof Chickens) {
                processor = new ChickenProcessor(animals);
            }
            processor.process();
            ThreadUtil.sleep(3000);
        }

//        System.out.println(animals.getName() + " start");
//        for (int i = Const.DEFAULT; i <= destination; i += animals.getRandomDistance()) {
//            ThreadUtil.sleep(1000);
//            System.out.println(animals.getName() + " has ran: " + i);
//        }
//        System.out.println(animals.getName() + " has done");
    }


}
