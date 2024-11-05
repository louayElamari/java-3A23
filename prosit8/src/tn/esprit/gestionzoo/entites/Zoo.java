package tn.esprit.gestionzoo.entites;

public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int nbrAnimals;
    private int nbrAquaticAnimals;

    // Default constructor
    public Zoo() {
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[10];  // **************
        this.nbrAnimals = 0;
        this.nbrAquaticAnimals = 0;
    }


    public Zoo(String name, String city) {
        this();
        this.name = name;
        this.city = city;
    }


    public boolean addAnimal(Animal animal) {
        if (nbrAnimals < nbrCages) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }

    // ********************
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals < aquaticAnimals.length) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
            System.out.println(aquatic.getName() + " has been added to the zoo's aquatic animals.");
        } else {
            System.out.println("The zoo's aquatic section is full!");
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        // Display the counts
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }


    public void display() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Animals in the Zoo:");
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].toString());
            }
        }

        System.out.println("Aquatic Animals in the Zoo:");
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] != null) {
                System.out.println(aquaticAnimals[i].toString());
            }
        }
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

    public int getNbrAquaticAnimals() {
        return nbrAquaticAnimals;
    }
    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }
}
