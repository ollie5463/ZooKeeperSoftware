package com.company;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setTitle("Zoo Application");

        Screen screen = new Screen(300,300);
        button = new Button("Click ME");
        button.setLayoutX(100);
        button.setLayoutY(100);
        screen.addButton(button) ;

//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
//
//         button.setOnAction((event)-> {
//             System.out.println("button pressed");
//         });
//
//        Scene scene = new Scene(layout,300,300);
//        Rectangle rectangle = new Rectangle(50,50);
//        layout.getChildren().add(rectangle);
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }


}
