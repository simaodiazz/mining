package com.github.simaodiazz.mining.model.mine.block;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bukkit.Material;

@AllArgsConstructor
@Data
public abstract class Block {

    private BlockType type;
    private Material material;
    private double chance;

}