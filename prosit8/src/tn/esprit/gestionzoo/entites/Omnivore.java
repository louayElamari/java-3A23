package tn.esprit.gestionzoo.entites;

public interface Omnivore<T> extends Carnivore<T>, Harbivore<T> {
    void eatPlantAndMeat(T food);
}