package com.ntqsolution.service;

import com.ntqsolution.entity.Animals;

public class ChickenProcessor extends AnimalProcessor {

    public ChickenProcessor(Animals animals) {
        super(animals);
    }

    @Override
    public void process() {
        System.out.println(animals.getName() + " đã luộc!");
    }
}
