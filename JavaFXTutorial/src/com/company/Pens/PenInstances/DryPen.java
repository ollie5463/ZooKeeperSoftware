package com.company.Pens.PenInstances;

import com.company.Animals.Animal;
import com.company.Pens.Pen;
import com.company.Pens.PenType;

public class DryPen extends Pen {

    public DryPen(int length, int width, int temp) {
        super(PenType.DRY, length, width, temp);
        this.availableSpace = length * width;
    }
}
