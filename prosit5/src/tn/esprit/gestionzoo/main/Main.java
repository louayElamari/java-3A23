package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entites.*;

public class Main {
    public static void main(String[] args) {




        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin("x" ,20,true,"y",99);
        Penguin penguin = new Penguin();

        // Display the objects (toString will be improved later)
        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);
    }


}
