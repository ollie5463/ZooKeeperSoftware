package com.company;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Main extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage();
    }

    public void mainStage(){
        Screen screen = new Screen(300,300);
        button = new Button("Click ME");
        screen.addButton(button) ;
        button.setOnAction((event)->{
            secondaryStage();
        });
    }

    public void secondaryStage(){
        Screen screen = new Screen(300,300);
        button = new Button("ooooooo");
        screen.addButton(button) ;
        button.setOnAction((event)->{
            mainStage();
        });
    }
}
