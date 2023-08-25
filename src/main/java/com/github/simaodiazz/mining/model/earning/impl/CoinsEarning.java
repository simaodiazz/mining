package com.github.simaodiazz.mining.model.earning.impl;

import com.github.simaodiazz.mining.model.earning.Earning;
import com.github.simaodiazz.mining.model.earning.EarningType;
import lombok.Getter;

@Getter
public class CoinsEarning extends Earning {

    private final double value;

    public CoinsEarning(double value) {
        super(EarningType.COINS);
        this.value = value;
    }
}
