package com.github.simaodiazz.mining.model.grade.enchantment;

public abstract class Enchantment {

    public abstract void getName();

    public abstract double getMaxLevel();

    public abstract double getStartLevel();

    public abstract EnchantmentTarget getTarget();
}