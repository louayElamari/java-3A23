package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entites.*;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();


        Dolphin dolphin = new Dolphin("Dolphin1", 5, true, "Ocean", 30.5f);
        Penguin penguin1 = new Penguin("Penguin1", 3, false, "Arctic", 20.0f);
        Penguin penguin2 = new Penguin("Penguin2", 4, false, "Arctic", 15.0f);
        Penguin penguin3 = new Penguin("Penguin3", 2, false, "Arctic", 25.0f);




        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);
        myZoo.addAquaticAnimal(penguin3);


        myZoo.display();


        System.out.println("Aquatic Animals Swimming:");
        for (int i = 0; i < myZoo.getNbrAquaticAnimals(); i++) {
            if (myZoo.getAquaticAnimals()[i] != null) {
                myZoo.getAquaticAnimals()[i].swim();
            }
        }


        float maxDepth = myZoo.maxPenguinSwimmingDepth();
        System.out.println("Maximum swimming depth of penguins: " + maxDepth + " meters.");

        myZoo.displayNumberOfAquaticsByType();
        Dolphin dolphin10 = new Dolphin("Dolphin999", 5, true, "Ocean", 30.5f);
        Dolphin dolphin20 = new Dolphin("Dolphin999", 5, true, "Ocean", 30.5f);

        if (dolphin10.equals(dolphin20)) {
            System.out.println("The two aquatic animals are identical.");
        } else {
            System.out.println("The two aquatic animals are different.");
        }

    }
    }



