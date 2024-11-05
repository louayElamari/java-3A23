package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entites.*;

public class Main {
    public static void main(String[] args) {

            // Create an instance of Aquatic subclass (e.g., Dolphin)
            Aquatic dolphin = new Aquatic("Dolphin", 5, true, "Ocean") {
                @Override
                public void swim() {
                    System.out.println(getName() + " is swimming.");
                }
            };

            // Testing eatMeat method for Aquatic (dolphin)
            dolphin.eatMeat(Food.MEAT);

            // Create an instance of Terrestrial
            Terrestrial lion = new Terrestrial("Lion", 8, true, 4);

            // Testing eating methods for Terrestrial (lion)
            lion.eatMeat(Food.MEAT);
            lion.eatPlant(Food.PLANT);
            lion.eatPlantAndMeat(Food.BOTH);
        }

    }



