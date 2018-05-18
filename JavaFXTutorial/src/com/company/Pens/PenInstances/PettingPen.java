package com.company.Pens.PenInstances;

import com.company.Animals.Animal;
import com.company.Pens.Pen;
import com.company.Pens.PenType;

public class PettingPen extends Pen {

    PettingPen(int length, int width, int temp){
        super(PenType.PETTING, length, width, temp);
    }
}
