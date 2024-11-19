package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.enums.Food;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.ZooFullException;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {

        /*Animal lion = new Animal("xxxx","Lion",8,true);

        Animal tigre = new Animal("xxxxx","Tigre",10,true);

        Animal renard = new Animal("xxxxxx","Renard",12,true);

        Zoo myZoo = new Zoo("Friguia","Hammamet");

        Zoo zoo = new Zoo("Belvidere","Bardo");

        lion.displayAnimal();
        tigre.displayAnimal();
        renard.displayAnimal();
        zoo.displayZoo();

        System.out.println(lion);
        System.out.println(tigre);
        System.out.println(renard);
        System.out.println(zoo);

        System.out.println(lion.toString());
        System.out.println(tigre.toString());
        System.out.println(renard.toString());
        System.out.println(zoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(tigre));
        System.out.println(myZoo.addAnimal(renard));

        // Tentative de ré-ajouter le même animal
        System.out.println(myZoo.addAnimal(lion));

        myZoo.displayAnimals();

        int index1 = myZoo.searchAnimal(lion);
        System.out.println("L'animal Lion est trouvé à l'indice: " + index1);
        //System.out.println(myZoo.searchAnimal(lion));

        Animal chat = new Animal("xxxx","Chat",7,true);
        System.out.println(myZoo.searchAnimal(chat));

        System.out.println(myZoo.removeAnimal(renard));

        myZoo.displayAnimals();

        myZoo.addAnimal(chat);

        int index2 = myZoo.searchAnimal(chat);
        System.out.println("L'animal Chat est trouvé à l'indice: " + index2);
        //System.out.println(myZoo.searchAnimal(chat));

        myZoo.displayAnimals();

        //System.out.println(tn.esprit.gestionzoo.entities.Zoo.comparer(myZoo,zoo));
        Zoo zooLePlusGrand = Zoo.comparer(myZoo, zoo);
        System.out.println("Le zoo avec le plus d'animaux est: " + zooLePlusGrand.getName());

        boolean zooPlein = myZoo.isZooFull();
        System.out.println("Est ce que le zoo est plein ? " + zooPlein); */

        //Partie héritage

        // Création des instances avec constructeurs par défaut
        /*
        Aquatic aquaticAnimal = new Aquatic();
        Terrestrial terrestrialAnimal = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        // Affichage des objets (affichera par défaut les références car toString() n'est pas encore redéfini)
        System.out.println(aquaticAnimal);
        System.out.println(terrestrialAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Création des instances avec des constructeurs paramétrés
        Aquatic aquaticAnimalP = new Aquatic("Aquatic Family", "Shark", 5, false, "Ocean");
        Terrestrial terrestrialAnimalP = new Terrestrial("Terrestrial Family", "Elephant", 10, true, 4);
        Dolphin dolphinP = new Dolphin("Dolphin Family", "Flipper", 7, true, "Sea" , 25.5f);
        Penguin penguinP = new Penguin("Penguin Family", "Pingu", 4, false, "Antarctica", 30.2f);

        // Affichage des objets (appel de toString() automatiquement)
        System.out.println(aquaticAnimalP);
        System.out.println(terrestrialAnimalP);
        System.out.println(dolphinP);
        System.out.println(penguinP);

        aquaticAnimalP.swim();  // Appel à la méthode swim() de Aquatic
        dolphinP.swim();        // Appel à la méthode swim() de Dolphin
        penguinP.swim();        // Appel à la méthode swim() hérité de Aquatic

         */

        //Partie polymorphisme

        /*Dolphin d = new Dolphin();
        d.setSwimmingSpeed(24.5f);
        Dolphin d1 = new Dolphin();
        d1.setSwimmingSpeed(21.8f);
        Dolphin d2 = new Dolphin();
        d2.setSwimmingSpeed(20.3f);
        Dolphin d3 = new Dolphin();
        d3.setSwimmingSpeed(22.6f);

        myZoo.addAquaticAnimal(d);
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(d2);
        myZoo.addAquaticAnimal(d3);

        Penguin p = new Penguin();
        p.setSwimmingDepth(24.6f);
        Penguin p1 = new Penguin();
        p1.setSwimmingDepth(29.6f);
        Penguin p2 = new Penguin();
        p2.setSwimmingDepth(219.6f);
        Penguin p3 = new Penguin();
        p1.setSwimmingDepth(2.6f);

        myZoo.addAquaticAnimal(p);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);
        myZoo.addAquaticAnimal(p3);

        myZoo.addAquaticAnimal(new Penguin());

        for (int i = 0; i < myZoo.getNbrAquatics(); i++) {
            Aquatic[] aquatics = myZoo.getAquaticAnimals();
            aquatics[i].swim();
        }

        System.out.println(myZoo.maxPenguinSwimmingDepth());
        System.out.println(myZoo.averageSwimmingSpeed());
        myZoo.displayNumberOfAquaticsByType();*/

        //Exceptions
        Animal tigre = new Animal();
        tigre.setName("tigre");
        try{
            tigre.setAge(8);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        tigre.setFamily("Cats");
        tigre.setMammal(true);

        Zoo myZoo = new Zoo("Belvider park", "Bardo");
        Zoo notMyZoo = new Zoo("Friguia park","Hammamet");

        Animal cat = new Animal("Cats","Tom",4,true);

        try{
            myZoo.addAnimal(tigre);
        } catch (ZooFullException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animals");
        }

        try{
            myZoo.addAnimal(cat);
        } catch (ZooFullException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animals");
        }

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(cat));
        Animal dog = new Animal("Bichon", "Soleil", 2, true);
        System.out.println(myZoo.searchAnimal(dog));

        myZoo.displayAnimals();

        try{
            myZoo.addAnimal(dog);
        } catch (ZooFullException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animals");
        }

        try{
            myZoo.addAnimal(tigre);
        } catch (ZooFullException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animals");
        }

        myZoo.displayAnimals();

        //polymorphisme

        Dolphin d = new Dolphin();
        d.setSwimmingSpeed(24.5f);
        Dolphin d1 = new Dolphin();
        d1.setSwimmingSpeed(21.8f);
        Dolphin d2 = new Dolphin();
        d2.setSwimmingSpeed(20.3f);
        Dolphin d3 = new Dolphin();
        d3.setSwimmingSpeed(22.6f);

        myZoo.addAquaticAnimal(d);
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(d2);
        myZoo.addAquaticAnimal(d3);

        Penguin p = new Penguin();
        p.setSwimmingDepth(24.6f);
        Penguin p1 = new Penguin();
        p1.setSwimmingDepth(29.6f);
        Penguin p2 = new Penguin();
        p2.setSwimmingDepth(219.6f);
        Penguin p3 = new Penguin();
        p1.setSwimmingDepth(2.6f);

        myZoo.addAquaticAnimal(p);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);
        myZoo.addAquaticAnimal(p3);

        myZoo.addAquaticAnimal(new Penguin());

        for (int i = 0; i < myZoo.getNbrAquatics(); i++) {
            Aquatic[] aquatics = myZoo.getAquaticAnimals();
            aquatics[i].swim();
        }

        System.out.println(myZoo.maxPenguinSwimmingDepth());
        System.out.println(myZoo.averageSwimmingSpeed());
        myZoo.displayNumberOfAquaticsByType();


        //interfaces

        Penguin penguin = new Penguin("Wild animals", "Pingu", 3, true, "Ocean", 25.6f);
        penguin.eatMeat(Food.MEAT);

        Dolphin dolphin = new Dolphin("Delphinoidea", "Willy", 5, true, "Ocean", 34.2f);
        dolphin.eatMeat(Food.MEAT);

        Terrestrial terrestrial = new Terrestrial("Bears", "Winnie", 6, true, 4);
        terrestrial.eatPlantAndMeet(Food.BOTH);

        Terrestrial terrestrial2 = new Terrestrial("Rabbits", "Bugs bunny", 2, true, 4);
        terrestrial2.eatPlant(Food.PLANT);


    }
}
