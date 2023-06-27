package org.example;

public class Main {
    public static void main(String[] args) {
        Worker farmer = new Worker("Mc Donald",
                100,
                "Food",
                0
        );

        Worker wizard = new Worker("Amayak",
                100,
                "Diamond",
                0);

        Worker monk = new Worker("Old monk",
                100,
                "Remedy",
                0
        );


        Warrior gangster = new Warrior("Al Capone",
                100,
                "Pistol",
                10,
                false);

        Warrior spearman = new Warrior("Brad",
                100,
                "Spear",
                1000,
                true);

        Warrior sniper = new Warrior("Sam",
                100,
                "Izh - 18",
                20,
                false);


    }
}