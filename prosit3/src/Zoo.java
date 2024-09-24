public class Zoo {
 Animal[] animals;
 String name;
 String city;
 final int nbrCages = 25;
 int nbrAnimals;


    public Zoo() {
        this.animals = new Animal[nbrCages];
        this.nbrAnimals = 0;
    }


    public Zoo(String name, String city) {
        this();
        this.name = name;
        this.city = city;
    }


    public boolean addAnimal(Animal animal) {
        if (nbrAnimals < nbrCages && searchAnimal(animal) == -1) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }


    public void display() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            }
        }
    }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)     ) {
                return i;
            }
        }
        return -1;
    }


    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = animals[nbrAnimals - 1];
            animals[nbrAnimals - 1] = null;
            nbrAnimals--;
            return true;
        }
        return false;
    }


    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.nbrAnimals > z2.nbrAnimals) ? z1 : z2;
    }
}
