package Urok_6;

import java.util.Random;

public class Cat extends Animal implements IFindFood {
    Random rnd = new Random();

    public Cat(String name) {
        super(name);
        runAbility = 180 + rnd.nextInt(40);
        jumpAbility = (float) (1.5 + rnd.nextFloat());
    }

    public void goFindFood (float distanceFood) {
        float animalPower = runAbility + jumpAbility;
        System.out.println("Сила животного: " + animalPower);
        if (animalPower >= distanceFood) {
            System.out.println("Еда найдена!!!");
        } else {
            System.out.println("Еду найти не удалось.");
        }
    }

    @Override
    public void sayMyName() {
        System.out.println(name);
    }

    @Override
    public  void swim (float swimDistance){
        System.out.println("Кошки не плавают");
    }

    @Override
    public void run (float runDistance){
        if (runDistance <= runAbility) {
            System.out.println("Кот пробежал " + runDistance + " метров.");
        }
        else {
            System.out.println("Кот не может пробежать больше чем " + runAbility +" метров.");
        }
    }

    @Override
    public void jump (float jumpHeight) {
        if (jumpHeight <= jumpAbility) {
            System.out.println("Кот прыгнул на  " + jumpHeight + " метров.");
        }
        else {
            System.out.println("Кот не может прыгнуть выше чем на " + jumpAbility + " метра.");
        }
    }



}
