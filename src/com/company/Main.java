package com.company;

import com.company.Animals.Bat;
import com.company.Animals.Bear;
import com.company.Animals.Snake;

public class Main {

    public static void main(String[] args) {

        Bat bat1 = new Bat(18.2,5,"Too","кун","жай","male",2000,"Special bat");
//        System.out.println(bat1);

        Bear bear1 = new Bear(150.5,100,"forest","кун","жупташуу мезгили","ургач");
//        System.out.println(bear1.canReproduce());
//        System.out.println(bear1.canReproduce());
//        System.out.println(bear1.getCub());
//        System.out.println(bear1);
//        System.out.println(bear1.amountFood());
//        System.out.println(bear1.dailyNorm());

        Snake snake1 = new Snake(17,20,"amazons","кун","жай","ургач",
                    15,"what","whaat","whaaaat","Анаконда",
                true,true,true,"something"
                );

//        System.out.println(snake1.tasksRequired());
        snake1.food();

    }
}
