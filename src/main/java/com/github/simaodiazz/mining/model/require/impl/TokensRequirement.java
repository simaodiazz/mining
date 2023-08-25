package com.github.simaodiazz.mining.model.require.impl;

import com.github.simaodiazz.mining.model.require.Require;
import com.github.simaodiazz.mining.model.require.RequireType;
import lombok.Getter;

@Getter
public class TokensRequirement extends Require {

    private final double value;

    public TokensRequirement(double value) {
        super(RequireType.TOKENS);
        this.value = value;
    }
}
