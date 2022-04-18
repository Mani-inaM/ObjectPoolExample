package com.company;

public class Main {

    public static void main(String[] args) {
        MercenaryPool pool = MercenaryPool.getInstance();
        pool.fillPool();
        Mercenary mercenary0= (Mercenary) pool.get();
        Mercenary mercenary1= (Mercenary) pool.get();
        Mercenary mercenary2= (Mercenary) pool.get();
        Mercenary mercenary3= (Mercenary) pool.get();
        Mercenary mercenary4= (Mercenary) pool.get();
        System.out.println(mercenary0.getName()+" went on an adventure when he was level "+mercenary0.getLevel()+" and had:\n"+mercenary0.showInventory()+"in their bag");
        System.out.println(mercenary1.getName()+" went on an adventure when he was level "+mercenary1.getLevel()+" and had:\n"+mercenary1.showInventory()+"in their bag");
        System.out.println(mercenary2.getName()+" went on an adventure when he was level "+mercenary2.getLevel()+" and had:\n"+mercenary2.showInventory()+"in their bag");
        System.out.println(mercenary3.getName()+" went on an adventure when he was level "+mercenary3.getLevel()+" and had:\n"+mercenary3.showInventory()+"in their bag");
        System.out.println(mercenary4.getName()+" went on an adventure when he was level "+mercenary4.getLevel()+" and had:\n"+mercenary4.showInventory()+"in their bag");

    }
}
