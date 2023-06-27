package org.example;

public class Warrior extends Personages {
    public Warrior(String name, int enegry) {
        super(name, enegry);
    }
    String weapon;
    int weaponResourse;
    boolean defence;

    public Warrior(String name, int enegry, String weapon, int weaponResourse, boolean defence) {
        super(name, enegry);
        this.weapon = weapon;
        this.weaponResourse = weaponResourse;
        this.defence = defence;
    }

    int attack() {
        return weaponResourse -= 1;
    }
    int recovery() {
        return enegry += 10;
    }
}
