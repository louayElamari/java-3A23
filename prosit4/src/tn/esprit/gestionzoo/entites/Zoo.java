package tn.esprit.gestionzoo.entites;

public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    public final int nbrCages = 25;
    public int nbrAnimals;


    public Zoo() {
        this.animals = new Animal[nbrCages];
        this.nbrAnimals = 0;
    }


    public Zoo(String name, String city) {
        this();
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Zoo name cannot be empty.");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
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




    public boolean addAnimal(Animal animal) {
        if (!isZooFull() && searchAnimal(animal) == -1)

        {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }


}




