package tn.esprit.gestionzoo.entites;

public  abstract  class Aquatic extends Animal {
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

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof Aquatic)) return false;


        Aquatic aquatic = (Aquatic) obj;


        return this.getName().equals(aquatic.getName()) &&
                this.getAge() == aquatic.getAge() &&
                this.habitat.equals(aquatic.habitat);
    }
}
