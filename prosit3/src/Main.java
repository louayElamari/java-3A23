public class Main {
    public static void main(String[] args) {


        Zoo myZoo = new Zoo("esprit", "tunis");

        // Création des animaux
        Animal lion = new Animal("lion", "lion", 7, true);
        Animal wolf = new Animal("wolf", "wolf", 5, true);
        Animal tiger = new Animal("tiger", "tiger", 5, true);


        boolean test;

        test = myZoo.addAnimal(lion);
        System.out.println("Ajout du lion: " + test);

        test = myZoo.addAnimal(wolf);
        System.out.println("Ajout du loup: " + test);

        test = myZoo.addAnimal(tiger);
        System.out.println("Ajout du tigre: " + test);

        test = myZoo.addAnimal(lion);
        System.out.println("Ajout du lion (duplicate): " + test);


        myZoo.display();


        int index = myZoo.searchAnimal(tiger);
        System.out.println("Le tigre est à l'indice: " + index);


        Animal elephant = new Animal("elephant", "tiger", 5, true);
        index = myZoo.searchAnimal(elephant);
        System.out.println("L'éléphant est à l'indice: " + index);

        test = myZoo.removeAnimal(lion);
        System.out.println("Suppression du lion: " + test);


        myZoo.display();
    }
}
