package Urok_6;

import java.util.Random;

public class Dog extends Animal implements IFindFood{
    Random rnd = new Random();

    public Dog(String name) {
        super(name);
        runAbility = 400 + rnd.nextInt(200);
        jumpAbility = (rnd.nextFloat());
        swimAbility = (float) (8 + rnd.nextInt(4));
    }

    public void goFindFood (float distanceFood) {
        float animalPower = runAbility + jumpAbility + swimAbility;
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
    public void run(float runDistance) {
        if (runDistance <= runAbility) {
            System.out.println("Собака пробежала " + runDistance + " метров.");
        }
        else {
            System.out.println("Собака не может пробежать больше чем " + runAbility + " метров.");
        }
    }

    @Override
    public void jump(float jumpHeight) {
        if (jumpHeight <= jumpAbility) {
            System.out.println("Собака прыгнула на  " + jumpHeight + " метров.");
        }
        else {
            System.out.println("Собака не может прыгнуть выше чем на " + jumpAbility + " метра.");
        }
    }

    @Override
    public void swim(float swimDistance) {
        if (swimDistance <= swimAbility) {
            System.out.println("Собака проплыла " + swimDistance + " метров.");
        }
        else {
            System.out.println("Собака не может проплыть больше " + swimAbility + " метров.");
        }

    }
}
