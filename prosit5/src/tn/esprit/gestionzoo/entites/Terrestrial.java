package tn.esprit.gestionzoo.entites;

public class Terrestrial extends  Animal {

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


}
