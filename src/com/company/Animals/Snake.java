package com.company.Animals;

import com.company.Interfaces.AnimalsInterface;

import java.util.Scanner;

public class Snake extends AbstractReptile implements AnimalsInterface {
    private String typeOfSnake;   //жыладнын туру
    private boolean poisonous; //уусу барбы же жокпу
    private  boolean irritated; //раздраженный или нет
    private  boolean hungry; // ачкабы же токпу
    private String species; // жылан жей турган тамактар

    public Snake(double height, int weight, String location, String timeOfDay, String season, String gender,
                 int length, String vision, String hearingAbilities, String typeOfReproduction,
                 String typeOfSnake, boolean poisonous, boolean irritated, boolean hungry,String species) {
        super(height, weight, location, timeOfDay, season, gender, length, vision, hearingAbilities, typeOfReproduction);
        this.typeOfSnake = typeOfSnake;
        this.poisonous = poisonous;
        this.irritated = irritated;
        this.hungry = hungry;
        this.species = species;
    }

    public String getTypeOfSnake() {
        if(typeOfSnake.equals("Анаконда") || typeOfSnake.equals("Питон")){
            this.setPoisonous(true);
        }return getTypeOfSnake();
    }

    public void setTypeOfSnake(String typeOfSnake) {
        this.typeOfSnake = typeOfSnake;
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public boolean isIrritated() {
        return irritated;
    }

    public void setIrritated(boolean irritated) {
        this.irritated = irritated;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    @Override
    public void abilitiesOfCrawling() {

    }

    @Override
    public String food() {
        String out = "";
        System.out.println("Жылан эмне жеди?");
        Scanner scanner = new Scanner(System.in);
        String tamak = scanner.nextLine();

//        if(this.species.equalsIgnoreCase("eggs")){
//            tamak = "eggs";
//        }else if (this.species.equalsIgnoreCase("rodents")){
//            tamak = "rodents";
//        }
//        System.out.println(tamak);

        if(tamak.equalsIgnoreCase("eggs")){
            System.out.println("Эгерде eggs жеген болсо кайсы чымчыктын тукумун жеди");
            scanner = new Scanner(System.in);
            String bird = scanner.nextLine();


            switch (bird) {
                case "Чабалекей", "Когучкон", "Буркут" -> {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println(bird + " жумурткасынан канчоону жеди? ");
                    int quantity = scanner1.nextInt();
                    if (quantity > 10) {
                        System.out.println("Жыландын курсагы ток");
                        this.setHungry(false);
                    } else if (quantity < 10) {
                        System.out.println("Жыландын курсагы ач");
                        this.setHungry(true);
                        this.setIrritated(true);
                    }
                }
            }
        }

        if(!tamak.equals("eggs")){

            System.out.println("эгерде eggs жебеген болсо анда Кайсы жаныбарды жеди ");
            scanner = new Scanner(System.in);
            tamak = scanner.nextLine();
            System.out.println(tamak+" га тойдубу жылан?");
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("ооба")){
                this.setHungry(false);
                System.out.println("жакшы анда");
            }else {
                System.out.println("Анда жыланга тамак бергиле");
                this.setHungry(true);
                this.setIrritated(true);
            }
        }return out;
    }

    @Override
    public String tasksRequired() {
        String out ="";
        if(this.getSeason().equalsIgnoreCase("кыш")){
            out = "уйку";
        }else if(this.getSeason().equalsIgnoreCase("жай")){
            out = "охотага чыгуу керек,болбосо ачка калабыз";
        }return out;
    }

    @Override
    public double dailyNorm() {
        return 0;
    }

    @Override
    public boolean huntForFood() {
        return this.getSeason() != "кыш" && this.isHungry();
    }

    @Override
    public boolean canReproduce() {
        return false;
    }
}
