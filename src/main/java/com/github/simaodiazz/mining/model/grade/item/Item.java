package com.github.simaodiazz.mining.model.grade.item;

import com.github.simaodiazz.mining.model.earning.Earning;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;

import java.util.List;

@AllArgsConstructor
@Getter
public abstract class Item {

    private ItemType type;
    private ItemStack visual;
    private List<Earning> earnings;

}
