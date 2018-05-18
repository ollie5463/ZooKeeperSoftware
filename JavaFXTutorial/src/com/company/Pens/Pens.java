package com.company.Pens;

import com.company.Animals.Animal;

public interface Pens {

    void addNewAnimal(Animal animal) throws Throwable;

    void removeAnimal(Animal animal) throws Throwable;

    int getNoOfAnimals();

    int getAvailableSpace();

}
