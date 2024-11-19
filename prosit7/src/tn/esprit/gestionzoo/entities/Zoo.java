package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Zoo {

    public static final int NUMBER_OF_CAGES = 3;
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private int nbrAnimals;
    private int nbrAquatics;

    public Zoo(){
    }

    public Zoo(String name,String city){
        this.animals = new Animal[NUMBER_OF_CAGES];
        this.aquaticAnimals = new Aquatic[10];
        this.name=name;
        this.city=city;
    }

    public int getNbrAquatics() {
        return nbrAquatics;
    }

    public void setNbrAquatics(int nbrAquatics) {
        this.nbrAquatics = nbrAquatics;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank())
            System.out.println("Le nom d'un Zoo ne doit pas etre vide !");
        else
            this.name = name;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city=city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public void displayZoo(){
        System.out.println("tn.esprit.gestionzoo.entities.Zoo : ");
        System.out.println("Name : "+name);
        System.out.println("City : "+city);
        System.out.println("NbrCages : "+NUMBER_OF_CAGES);
        System.out.println("nbrAnimals : "+nbrAnimals);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + ", N° Animals: " + nbrAnimals;
    }
    
    public void addAnimal(Animal animal) throws ZooFullException {
        if(searchAnimal(animal) != -1)
            System.out.println("This animal already exists !");
        if(isZooFull()) {
            throw new ZooFullException("The Zoo is full !");
        }
        animals[nbrAnimals]=animal;
        nbrAnimals++;
    }

    //2ème façon
    /*public boolean addAnimal(Animal animal)
    {
        if(isZooFull())
        {
            System.out.println("Le Zoo est plein !");
            return false;
        }
        for(int i=0; i<nbrAnimals; i++){
            if(animals[i].name.equals(animal.name)){
                System.out.println("Cet animal existe déjà !");
                return false;
            }
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }*/

    public int searchAnimal(Animal animal){
        for(int i=0; i<nbrAnimals ; i++)
        {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal);
        if(index != -1 ){
            for(int i=index; i<nbrAnimals -1 ; i++){
                animals[i]=animals[i+1];
            }
            animals[nbrAnimals - 1]=null;
            nbrAnimals--;
            return true;
        }
        return false;
    }

    public boolean isZooFull()
    {
        return nbrAnimals >= NUMBER_OF_CAGES;
    }

    public static Zoo comparer(Zoo z1,Zoo z2){
        if(z1.nbrAnimals > z2.nbrAnimals)
        {
            return z1;
        }
        return z2;
    }

    public void displayAnimals(){
        System.out.println("Animals : ");
        for(int i=0; i<nbrAnimals ; i++){
            System.out.println(animals[i]);
            //animals[i].displayAnimal();
        }
    }

    public void addAquaticAnimal(Aquatic aquatic){
          aquaticAnimals[nbrAquatics] = aquatic;
          nbrAquatics++;
    }

    public float maxPenguinSwimmingDepth(){
        float max = 0f;
        for (int i=0 ; i<nbrAquatics ; i++){
            if ( aquaticAnimals[i] instanceof Penguin penguin){
                if( max < penguin.getSwimmingDepth())
                    max = penguin.getSwimmingDepth();
            }
        }
        return max;
    }

    public float averageSwimmingSpeed(){
        float totalSpeed = 0f;
        int dolphinCount = 0;
        for (int i=0 ; i<nbrAquatics ; i++){
            if ( aquaticAnimals[i] instanceof Dolphin dolphin){
                totalSpeed += dolphin.getSwimmingSpeed();
                dolphinCount++;
            }
        }
        if ( dolphinCount == 0 )
            return 0f;
        return totalSpeed / dolphinCount;
    }

    public void displayNumberOfAquaticsByType(){
        int nbrPenguins = 0;
        int nbrDolphins = 0;
        for(int i=0;i<nbrAquatics ; i++){
            if ( aquaticAnimals[i] instanceof Penguin){
                nbrPenguins++;
            }
            if ( aquaticAnimals[i] instanceof Dolphin){
                nbrDolphins++;
            }
        }
        System.out.println("Le Zoo " + name + " contient " + nbrPenguins + " penguins et " + nbrDolphins + " dolphins ");
    }

}
































