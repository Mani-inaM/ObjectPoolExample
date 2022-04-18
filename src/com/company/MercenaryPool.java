package com.company;

public class MercenaryPool {

    private Mercenary[] reusables;
    private int size;
    private static MercenaryPool instance;

    private MercenaryPool(int size) {
        this.size = size;
        reusables = new Mercenary[size];
    }
    public static MercenaryPool getInstance() {
        if (instance == null) {
            instance = new MercenaryPool(5);
        }
        return instance;
    }

    public void fillPool() {
        for (int i = 0; i < size; i++) {
            reusables[i] = new Mercenary("Mercenary " + i, 200,20,5,0,1, 250, 40);
            reusables[i].addItem("Sword");
            reusables[i].addItem("Shield");
            reusables[i].addItem("Helmet");
            reusables[i].addItem("Armor");
            reusables[i].addItem("Boots");
            reusables[i].addItem("Potion of healing");
            reusables[i].addItem("Potion of mana");
            reusables[i].addItem("Potion of strength");
            reusables[i].addItem("Potion of agility");
            reusables[i].addItem("Potion of intelligence");
            reusables[i].addItem("Potion of vitality");
            reusables[i].addItem("Potion of luck");
        }
    }


    public Object get() {
        for (int i = 0; i < size; i++) {
            if (reusables[i] != null) {
                Object temp = reusables[i];
                reusables[i] = null;
                return temp;
            }
        }
        return null;
    }

    public void put(Mercenary reusable) {
        for (int i = 0; i < size; i++) {
            if (reusables[i] == null) {
                reusables[i] = reusable;
                return;
            }
        }
    }
}


