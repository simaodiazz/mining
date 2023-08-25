package com.github.simaodiazz.mining.model.mine.block.impl;

import com.github.simaodiazz.mining.model.earning.Earning;
import com.github.simaodiazz.mining.model.mine.block.Block;
import com.github.simaodiazz.mining.model.mine.block.BlockType;
import lombok.Getter;
import org.bukkit.Material;

import java.util.List;

@Getter
public class OreBlock extends Block {

    private final List<Earning> earnings;

    public OreBlock(Material material, double chance, List<Earning> earnings) {
        super(BlockType.ORE, material, chance);
        this.earnings = earnings;
    }
}
