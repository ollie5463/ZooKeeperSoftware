package com.company.Pens.PenInstances;

import com.company.Animals.Animal;
import com.company.Pens.Pen;
import com.company.Pens.PenType;

public class Aquarium extends Pen {
    public Aquarium(int length, int width, int height, int temp){
        super(PenType.AQUARIUM, length, width, temp);
        this.availableSpace = length * width * height;
    }

}

