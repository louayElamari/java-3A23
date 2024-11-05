package tn.esprit.gestionzoo.entites;

public class Terrestrial extends  Animal  implements Omnivore<Food>{


    int nbrLegs;
    public Terrestrial() {
        super();
        System.out.println("Terrestrial constructor");
    }
    public Terrestrial(String name, int age, boolean isMammal, int nbrLegs) {
        super(name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    public int getNbrLegs() {
        return nbrLegs;
    }


    public void setNbrLegs(int nbrLegs) {
        if (nbrLegs >= 0) {
            this.nbrLegs = nbrLegs;
        } else {
            System.out.println("Number of legs cannot be negative.");
        }
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " is eating meat.");
        } else {
            System.out.println(getName() + " cannot eat plants only.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getName() + " is eating plants.");
        } else {
            System.out.println(getName() + " cannot eat meat only.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " is eating both plants and meat.");
        } else {
            System.out.println(getName() + " can only eat both plant and meat together.");
        }
    }


}
