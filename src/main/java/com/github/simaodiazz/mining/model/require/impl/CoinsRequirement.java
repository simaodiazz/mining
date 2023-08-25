package com.github.simaodiazz.mining.model.require.impl;

import com.github.simaodiazz.mining.model.require.Require;
import com.github.simaodiazz.mining.model.require.RequireType;
import lombok.Getter;

@Getter
public class CoinsRequirement extends Require {

    private final double value;

    public CoinsRequirement(double value) {
        super(RequireType.COINS);
        this.value = value;
    }
}
