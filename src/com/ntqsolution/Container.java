package com.ntqsolution;

import com.ntqsolution.entity.Animals;

import java.util.concurrent.LinkedBlockingDeque;

public class Container {

    static LinkedBlockingDeque<Animals> queue = new LinkedBlockingDeque<>();

    public static void add(Animals animals) {
        queue.add(animals);
    }

    public static Animals pollAnimal() {
        return queue.poll();
    }

    public static int getSize() {
        return queue.size();
    }
}
