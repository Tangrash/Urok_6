package Urok_6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat barsik = new Cat("Барсик");
        barsik.jump(2);
        barsik.run(200);
        barsik.swim(11);
        barsik.goFindFood(11);

        Dog tuzik = new Dog("Тузик");
        tuzik.jump((float) .5);
        tuzik.swim(10);
        tuzik.run(500);
        tuzik.goFindFood((float) 510.5);


        IFindFood [] zoo = new IFindFood[10];
        for (int i = 0; i < zoo.length; i++){
            Random rnd = new Random();
            if (rnd.nextInt() < 0.5){
                zoo[i] = new Cat(("Кот " + i));
            }else {
                zoo[i] = new Dog(("Пес " + i));
            }
            zoo[i].sayMyName();
            zoo[i].goFindFood(rnd.nextInt(500));
        }


    }
}
