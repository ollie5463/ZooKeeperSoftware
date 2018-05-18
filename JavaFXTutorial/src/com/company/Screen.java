package com.company;

import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Screen{

    private Stage stage;
    private Group group;
    private TabPane tabPane;
    private Scene scene;
    private ArrayList<String> listOfTabs = new ArrayList<>();


    public  Screen(int height, int width){
        Stage stage = new Stage();
        this.stage = stage;

        Group group = new Group();
        this.group = group;

        Scene scene = new Scene(this.group,height,width);
        this.scene = scene;
        this.stage.setScene(scene);

        TabPane tabPane = new TabPane();
        this.tabPane = tabPane;
        this.tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

    }


    public void addTab(String tabText){
        listOfTabs.add(tabText);
        Tab tab = new Tab();
        tab.setText(tabText);
        tabPane.getTabs().add(tab);
        addToBorder();
        showScene();
    }

    public void setContentForPage(String searchedForTab, Node content){

        Tab tab = getTab(searchedForTab);
        tab.setContent(content);
    }

    public void addButton(Button button){
        group.getChildren().add(button);
        showScene();
    }

    public void setTitle(String title){
        this.stage.setTitle(title);
    }

    public String getTitle(){
        return this.stage.getTitle();
    }

    public void addScrollBar(Orientation orientation){
        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setOrientation(orientation);
        showScene();
        group.getChildren().add(scrollBar);
    }

    public ObservableList<Node> getChildrenOnScreen(){
        return group.getChildren();
    }

    private Tab getTab(String searchedForTab){
        int index = 0;
        for(String tab : listOfTabs){
            if(tab.equals(searchedForTab)){
                index = listOfTabs.indexOf(tab);
                break;
            }
        }
        Tab tab = tabPane.getTabs().get(index);
        return tab;
    }

    private void addToBorder(){
        BorderPane borderPane = new BorderPane();
        borderPane.prefHeightProperty().bind(scene.heightProperty());
        borderPane.prefWidthProperty().bind(scene.widthProperty());
        borderPane.setCenter(tabPane);
        group.getChildren().add(borderPane);

    }

    private void showScene(){
        this.stage.show();
    }


}
