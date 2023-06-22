package com.example.asstwo;

public class Subject {
    private String name;
    private int imageID;

    public static final Subject[] subject ={
            new Subject("head body parts",R.drawable.headbody),
            new Subject("upper body parts",R.drawable.upperbody),
            new Subject("lower body parts",R.drawable.lowerbody),


    };
    private Subject(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}

}
