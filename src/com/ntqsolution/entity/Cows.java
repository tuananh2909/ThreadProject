package com.ntqsolution.entity;

import com.ntqsolution.utils.Const;
import com.ntqsolution.utils.ThreadUtil;

public class Cows extends Animals {


    public Cows(String name) {
        super(name);
    }

    @Override
    public int getRandomDistance() {
        return ThreadUtil.getRandomInt(Const.COW_MIN_STEP_DISTANCE, Const.COW_MAX_STEP_DISTANCE);
    }
}
