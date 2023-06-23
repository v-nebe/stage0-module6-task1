package com.epam.mjc.stage0;

public class Animal {
    protected String color;
    protected int numberOfPaws;
    protected boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String description = "This animal is mostly " + color +". It has " + numberOfPaws +
                (numberOfPaws > 1 ? " paws" : " paw") + " and " + (hasFur ? "a" : "no") + " fur.";
        return description;
    }

}
