package com.github.simaodiazz.mining.model.earning.impl;

import com.github.simaodiazz.mining.model.earning.Earning;
import com.github.simaodiazz.mining.model.earning.EarningType;
import lombok.Getter;

@Getter
public class TokensEarning extends Earning {

    private final double value;

    public TokensEarning(double value) {
        super(EarningType.TOKENS);
        this.value = value;
    }
}