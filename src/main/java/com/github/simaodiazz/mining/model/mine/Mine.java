package com.github.simaodiazz.mining.model.mine;

import com.github.simaodiazz.mining.model.earning.Earning;
import com.github.simaodiazz.mining.model.mine.block.Block;
import com.github.simaodiazz.mining.model.mine.generator.Generator;
import com.github.simaodiazz.mining.model.require.Require;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.bukkit.inventory.ItemStack;

import java.util.List;

@AllArgsConstructor
@Data
public class Mine {

    private String name;
    private ItemStack icon;

    private List<Point> points;

    private Generator generator;

    private List<Require> requires;
    private List<Earning> earnings;
    private List<Block> blocks;

}
