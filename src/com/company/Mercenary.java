package com.company;

public class Mercenary {
    //this is a class for a mercenary they have a lot of variables, so it's a bit of a bother to make one.
    //Instead, we'll just use the same few mercenaries from the reusable pool whenever we need them
    private String name;
    private int health;
    private int damage;
    private int armor;
    private int experience;
    private int level;
    private int gold;
    private String[] inventory;
    private int inventorySize;
    private int inventoryCapacity;

    public Mercenary(String name, int health, int damage, int armor, int experience, int level, int gold, int inventoryCapacity) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.experience = experience;
        this.level = level;
        this.gold = gold;
        this.inventoryCapacity = inventoryCapacity;
        this.inventory = new String[inventoryCapacity];
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getArmor() {
        return this.armor;
    }

    public int getExperience() {
        return this.experience;
    }

    public int getLevel() {
        return this.level;
    }

    public int getGold() {
        return this.gold;
    }

    public int getInventorySize() {
        return this.inventorySize;
    }

    public int getInventoryCapacity() {
        return this.inventoryCapacity;
    }

    public String[] getInventory() {
        return this.inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setInventorySize(int inventorySize) {
        this.inventorySize = inventorySize;
    }

    public void setInventoryCapacity(int inventoryCapacity) {
        this.inventoryCapacity = inventoryCapacity;
    }
    public void addItem(String item) {
        if (inventorySize < inventoryCapacity) {
            inventory[inventorySize] = item;
            inventorySize++;
        }
    }
    public String showInventory() {
        String inventoryString = "";
        for (int i = 0; i < inventorySize; i++) {
            inventoryString += inventory[i] + "\n";
        }
        return inventoryString;
    }
}
