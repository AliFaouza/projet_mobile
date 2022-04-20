package com.example.comofood.Domain;

public class platsDomain {
    private String title;
    private String img;
    private String description;
    private Double fee;
    private int numberInCart;

     public platsDomain(String title, String img,String description, Double fee){
         this.title=title;
         this.img=img;
         this.description=description;
         this.fee=fee;
     }
    public platsDomain(String title,String img,String description, Double fee, int numberIncart){
        this.title=title;
        this.img=img;
        this.description=description;
        this.fee=fee;
        this.numberInCart=numberIncart;
    }
    public String getTitle(){
         return title;
    }
    public void setTitle(String title){
         this.title=title;
    }

}
