package com.company;

import javafx.scene.control.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ScreenManager {
    protected Screen screen;
    protected ArrayList<String> listOfTabs = new ArrayList<>();

    public ScreenManager(){
//        this.screen =
        this.screen = new Screen(500,500);
        createDefaultScreen();
    }

    public ScreenManager(int height, int width, ArrayList<String> listOfTabs){
        this.listOfTabs = listOfTabs;
        this.screen = new Screen(height,width);
        createScreen(height, width);
    }

    public void createDefaultScreen(){
        addDefaultTabs();
    }

    public void createScreen(int height, int width){
        addTabs();

//        Button button = new Button("click me");
//        screen.setContentForPage("Animal", button );
    }

    private void addDefaultTabs(){
        String[] defaultList = new String[]{"Home", "Animal", "Staff", "Pens"};

        listOfTabs.add("Home");
        listOfTabs.add("Animal");
        listOfTabs.add("Staff");
        listOfTabs.add("Pens");
        screen.addTab("Home");
        screen.addTab("Animal");
        screen.addTab("Staff");
        screen.addTab("Pens");
    }

    private void addTabs(){
        for(String tab : listOfTabs){
            screen.addTab(tab);
        }
    }
}
