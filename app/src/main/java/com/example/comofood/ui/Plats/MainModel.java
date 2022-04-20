package com.example.comofood.ui.Plats;

public class MainModel {
    Integer menu;
    String nomplats;
    public MainModel(Integer menu, String nomplats){
        this.menu=menu;
        this.nomplats=nomplats;
    }
    public Integer getMenu(){
        return menu;
    }
    public String getNomplats(){
        return nomplats;
    }
}
