package tn.esprit.gestionzoo.entites;

public class Dolphin  extends  Aquatic{
    float swimmingSpeed;
    public  Dolphin(){
        super();
        System.out.println("Dolphin constructor");
    }
    public Dolphin(String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public String toString() {
        return super.toString() + " Swimming Speed: " + swimmingSpeed;
    }
}
