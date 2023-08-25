package com.github.simaodiazz.mining.model.bounty.impl;

import com.github.simaodiazz.mining.model.bounty.Bounty;
import com.github.simaodiazz.mining.model.bounty.BountyType;
import lombok.Getter;

import java.util.List;

@Getter
public class CommandsBounty extends Bounty {

    private final List<String> value;

    public CommandsBounty(List<String> value) {
        super(BountyType.COMMANDS);
        this.value = value;
    }
}
