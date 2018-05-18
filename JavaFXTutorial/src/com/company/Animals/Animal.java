package com.company.Animals;

import com.company.Pens.PenType;

import java.util.ArrayList;

public class Animal {
    private PenType currentPen;
    private String animalName;
    private int waterVolumeNeeded;
    private int spaceNeeded;
    private ArrayList<PenType> suitablePens = new ArrayList<>();

    public Animal(ArrayList<PenType> suitablePens, String animalName, int spaceNeeded){
        this.suitablePens = suitablePens;
        this.animalName = animalName;
        this.spaceNeeded = spaceNeeded;
    }

    public Animal(ArrayList<PenType> suitablePens, String animalName, int spaceNeeded, int waterVolumeNeeded){
        this.suitablePens = suitablePens;
        this.animalName = animalName;
        this.spaceNeeded = spaceNeeded;
        this.waterVolumeNeeded = waterVolumeNeeded;
    }

    public int getSpaceNeeded(){
        return spaceNeeded;
    }

    public int getWaterVolumeNeeded(){
        return waterVolumeNeeded;
    }

    public ArrayList<PenType> getSuitablePens(){
        return this.suitablePens;
    }
}
