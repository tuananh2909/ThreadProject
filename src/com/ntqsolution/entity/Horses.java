package com.ntqsolution.entity;

import com.ntqsolution.utils.Const;
import com.ntqsolution.utils.ThreadUtil;

public class Horses extends Animals {

    public Horses(String name) {
        super(name);
    }

    @Override
    public int getRandomDistance() {
        return ThreadUtil.getRandomInt(Const.HORSE_MIN_STEP_DISTANCE, Const.HORSE_MAX_STEP_DISTANCE);
    }
}