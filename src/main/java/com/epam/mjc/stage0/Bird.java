package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird()
    {
        super("blue", 2, false);
    }

    @Override
    public String getDescription(){
        String description = "This animal is mostly " + color +". It has " + this.numberOfPaws +
                (this.numberOfPaws > 1 ? " paws" : " paw") + " and " + (hasFur ? "a" : "no") + " fur. " +
                "Moreover, it has 2 wings and can fly.";
        return description;
    }

}
