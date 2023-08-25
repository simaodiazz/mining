package com.github.simaodiazz.mining.model.mine.block.impl;

import com.github.simaodiazz.mining.model.bounty.Bounty;
import com.github.simaodiazz.mining.model.mine.block.Block;
import com.github.simaodiazz.mining.model.mine.block.BlockType;
import lombok.Getter;
import org.bukkit.Material;

import java.util.List;

@Getter
public class LuckyBlock extends Block {

    private final List<Bounty> bounties;

    public LuckyBlock(Material material, double chance, List<Bounty> bounties) {
        super(BlockType.LUCKY, material, chance);
        this.bounties = bounties;
    }
}
