package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entites.Animal;
import tn.esprit.gestionzoo.entites.Zoo;

public class Main {
    public static void main(String[] args) {

        // Création du zoo
        Zoo myZoo = new Zoo("esprit", "tunis");

        // Création des animaux
        Animal lion = new Animal("lion", "lion", 7, true);
        Animal wolf = new Animal("wolf", "wolf", 5, true);
        Animal tiger = new Animal("tiger", "tiger", 5, true);

        boolean test;

        // Ajout des animaux dans le zoo
        test = myZoo.addAnimal(lion);
        System.out.println("Ajout du lion: " + test);

        test = myZoo.addAnimal(wolf);
        System.out.println("Ajout du loup: " + test);

        test = myZoo.addAnimal(tiger);
        System.out.println("Ajout du tigre: " + test);

        // Tentative d'ajout d'un animal dupliqué
        test = myZoo.addAnimal(lion);
        System.out.println("Ajout du lion (duplicate): " + test);

        // Affichage des animaux dans le zoo
        myZoo.display();

        // Recherche du tigre
        int index = myZoo.searchAnimal(tiger);
        System.out.println("Le tigre est à l'indice: " + index);

        // Création d'un nouvel animal
        Animal elephant = new Animal("elephant", "elephant", 5, true);
        index = myZoo.searchAnimal(elephant);
        System.out.println("L'éléphant est à l'indice: " + index);

        // Suppression du lion
        test = myZoo.removeAnimal(lion);
        System.out.println("Suppression du lion: " + test);

        // Affichage après suppression du lion
        myZoo.display();
    }
}
