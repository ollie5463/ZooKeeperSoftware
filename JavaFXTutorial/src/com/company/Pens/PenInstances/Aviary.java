package com.company.Pens.PenInstances;

import com.company.Animals.Animal;
import com.company.Pens.Pen;
import com.company.Pens.PenType;

public class Aviary extends Pen {
    public Aviary(int length, int width, int temp) {
        super(PenType.AVIARY, length, width, temp);
        this.availableSpace = length * width;
    }
}
