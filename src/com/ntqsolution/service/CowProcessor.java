package com.ntqsolution.service;

import com.ntqsolution.entity.Animals;

public class CowProcessor extends AnimalProcessor {

    public CowProcessor(Animals animals) {
        super(animals);
    }

    @Override
    public void process() {
        System.out.println(animals.getName() + " đã xẻ thịt!");
    }
}
