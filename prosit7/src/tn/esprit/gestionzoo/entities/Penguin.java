package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.enums.Food;

public class Penguin extends Aquatic{

    private float swimmingDepth;

    public Penguin() {}

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim()
    {
        System.out.println("This penguin is swimming");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth:" + swimmingDepth;
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("The penguin " + getName() + " is eating " + meat);
    }
}
