package com.github.simaodiazz.mining.model.grade;

import com.github.simaodiazz.mining.model.earning.Earning;
import com.github.simaodiazz.mining.model.require.Require;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.bukkit.inventory.ItemStack;

import java.util.List;

@AllArgsConstructor
@Data
public class Grade {

    private String name;

    private ItemStack pickaxe;
    private ItemStack helmet;
    private ItemStack chestplate;
    private ItemStack leggings;
    private ItemStack boots;

    private List<Require> requires;
    private List<Earning> earnings;

}
