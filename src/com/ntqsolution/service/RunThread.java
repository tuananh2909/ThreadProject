package com.ntqsolution.service;

import com.ntqsolution.entity.Animals;
import com.ntqsolution.entity.Horses;
import com.ntqsolution.utils.Const;
import com.ntqsolution.utils.ThreadUtil;

public class RunThread extends Thread {

    private Animals animals;

    private int destination;

    public RunThread(Animals animals) {
        this.animals = animals;
        if (animals instanceof Horses) {
            destination = Const.HORSE_DESTINATION;
        } else {
            destination = Const.COW_DESTINATION;
        }
    }

    @Override
    public void run() {
        System.out.println(animals.getName() + " start");
        for (int i = 0; i <= destination; i += animals.getRandomDistance()) {
            ThreadUtil.sleep(1000);
            System.out.println(animals.getName() + " has ran: " + i);
        }
        System.out.println(animals.getName() + " has done");
    }


}
