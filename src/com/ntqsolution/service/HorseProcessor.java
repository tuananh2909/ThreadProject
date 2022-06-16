package com.ntqsolution.service;

import com.ntqsolution.entity.Animals;
import com.ntqsolution.utils.Const;

public class HorseProcessor extends AnimalProcessor {

    public HorseProcessor(Animals animals) {
        super(animals);
    }

    @Override
    public void process() {
        System.out.println(animals.getName() + " bắt đầu");
        for (int i = Const.DEFAULT; i <= Const.HORSE_DESTINATION; i += animals.getRandomDistance()) {
            System.out.println(animals.getName() + " đã chạy được: " + i);
        }
        System.out.println(animals.getName() + " đã xẻ thịt!");
    }
}
