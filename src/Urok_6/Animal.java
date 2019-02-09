package Urok_6;

public abstract class Animal {
    String name;
    float runAbility;
    float swimAbility;
    float jumpAbility;


    public Animal (String name){
        this.name = name;
    }

    public abstract void  run (float runDistance);

    public  abstract void jump (float jumpHeight);

    public abstract void swim(float swimDistance);

}
