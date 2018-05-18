package com.company;


import com.company.Animals.Animal;
import com.company.Pens.*;
import com.company.Pens.PenInstances.Aquarium;
import com.company.Pens.PenInstances.DryPen;
import com.company.Pens.PenInstances.PartWaterPartDryPen;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    public static void main(String[] args) {
//        launch(args);
    

    }

    public static void testMethodForPen(){
        ArrayList<PenType> suitablePens = new ArrayList<>();
        suitablePens.add(PenType.DRY);
        suitablePens.add(PenType.PARTWATERPARTDRY);
        suitablePens.add(PenType.PETTING);
        Animal dog = new Animal(suitablePens, "dog", 50, 50);

        PartWaterPartDryPen partWaterPartDryPen = new PartWaterPartDryPen(50, 50, 50, 25);
        partWaterPartDryPen.addNewAnimal(dog);
        partWaterPartDryPen.removeAnimal(dog);
        partWaterPartDryPen.addNewAnimal(dog);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ScreenManager screenManager = new ScreenManager();
        }

    }