package com.company;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Screen {

    private ArrayList<Button> listOfButtonsOnScreen = new ArrayList<>();
    private Stage stage;
    private StackPane layout;

    public Screen(int height, int width){
        Stage stage = new Stage();
        this.stage = stage;

        StackPane layout = new StackPane();
        this.layout = layout;

        Scene scene = new Scene(this.layout,height,width);
        this.stage.setScene(scene);
    }

    public void addButton(Button button){
        this.listOfButtonsOnScreen.add(button);
        layout.getChildren().add(button);
        showScene();
    }
    public void setTitle(String title){
        this.stage.setTitle(title);
    }
    public String getTitle(){
        return this.stage.getTitle();
    }

    private void showScene(){
        this.stage.show();
    }
}
