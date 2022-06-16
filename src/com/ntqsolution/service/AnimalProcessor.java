package com.ntqsolution.service;

import com.ntqsolution.entity.Animals;

public abstract class AnimalProcessor {
    public Animals animals;

    public AnimalProcessor(Animals animals) {
        this.animals = animals;
    }

    public abstract void process();
}
