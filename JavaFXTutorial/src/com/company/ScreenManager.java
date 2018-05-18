package com.company;

import java.util.ArrayList;

public class ScreenManager {
    private Screen screen;
    private ArrayList<String> listOfTabs = new ArrayList<>();

    public ScreenManager(){
        this.screen = new Screen(500,500);
        createDefaultScreen();
    }

    public ScreenManager(int height, int width, ArrayList<String> listOfTabs){
        this.listOfTabs = listOfTabs;
        this.screen = new Screen(height,width);
        createScreen(height, width);
    }

    private void createDefaultScreen(){
        addDefaultTabs();
    }

    private void createScreen(int height, int width){
        this.screen = new Screen(height, width);
        addTabs();
    }

    private void addDefaultTabs(){
        String[] defaultList = new String[]{"Home", "Animal", "Staff", "Pens"};

        for(String item : defaultList){
            listOfTabs.add(item);
            screen.addTab(item);
        }
    }

    private void addTabs(){
        for(String tab : listOfTabs){
            screen.addTab(tab);
        }
    }
}
