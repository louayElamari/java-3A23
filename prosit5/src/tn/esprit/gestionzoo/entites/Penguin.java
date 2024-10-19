package tn.esprit.gestionzoo.entites;

public class Penguin extends  Aquatic {
    float swimmingDepth;
    public Penguin() {
        super();
        System.out.println("Penguin constructor");
    }
    public Penguin(String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString() {
        return super.toString() +  " Swimming Depth: " + swimmingDepth;
    }
}
