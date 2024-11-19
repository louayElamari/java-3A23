package tn.esprit.gestionzoo.interfaces;

public interface Omnivore <T> extends Carnivore<T> ,Herbivore<T>{

    void eatPlantAndMeet(T food);
}
