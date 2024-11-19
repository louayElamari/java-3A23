package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Carnivore;
import tn.esprit.gestionzoo.entities.enums.Food;

public abstract non-sealed class Aquatic extends Animal implements Carnivore<Food> {

    protected String habitat;

    public Aquatic(){}

    public Aquatic(String family,String name,int age,boolean isMammal,String habitat){
        super(family,name,age,isMammal);
        this.habitat = habitat;
    }

    public String getHabitat(){
        return habitat;
    }

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    @Override
    public String toString(){
        return super.toString()+", habitat: "+ habitat;
    }

    /*public void swim()
    {
        System.out.println("This aquatic animal is swimming");
    }*/

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
         if(obj == null) return false;
         if(obj == this) return true;
         if(obj instanceof Aquatic aquatic){
             return aquatic.habitat.equals(habitat) && aquatic.getName().equals(super.getName()) && aquatic.getAge() == super.getAge() ;
         }
         return false;
    }
}
