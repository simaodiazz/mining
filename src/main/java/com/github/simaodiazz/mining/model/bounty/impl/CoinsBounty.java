package com.github.simaodiazz.mining.model.bounty.impl;

import com.github.simaodiazz.mining.model.bounty.Bounty;
import com.github.simaodiazz.mining.model.bounty.BountyType;
import lombok.Getter;

@Getter
public class CoinsBounty extends Bounty {

    private final double value;

    public CoinsBounty(double value) {
        super(BountyType.COINS);
        this.value = value;
    }
}