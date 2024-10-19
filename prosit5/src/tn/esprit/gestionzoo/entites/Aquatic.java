package tn.esprit.gestionzoo.entites;

public class Aquatic extends Animal {
    private String habitat;


    public Aquatic() {
        super();
        System.out.println("Aquatic constructor");
    }
    public Aquatic(String name, int age, boolean isMammal, String habitat) {
        super(name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.trim().isEmpty()) {
            this.habitat = habitat;
        } else {
            throw new IllegalArgumentException("Habitat cannot be empty.");
        }
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
