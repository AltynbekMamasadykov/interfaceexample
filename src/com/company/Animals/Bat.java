package com.company.Animals;

import com.company.Interfaces.AnimalsInterface;

public class Bat extends AbstractMammal implements AnimalsInterface {
    //класслетучихмышей
    private int mosquitoesEaten; //кол-во комаров сьеденных
    private String typesOfBats; //жарганаттардын типтери

    public Bat(double height, int weight, String location, String timeOfDay, String season, String gender, int mosquitoesEaten, String typesOfBats) {
        super(height, weight, location, timeOfDay, season, gender);
        this.mosquitoesEaten = mosquitoesEaten;
        this.typesOfBats = typesOfBats;
    }

    public int getMosquitoesEaten() {
        return mosquitoesEaten;
    }

    public void setMosquitoesEaten(int mosquitoesEaten) {
        this.mosquitoesEaten = mosquitoesEaten;
    }

    public String getTypesOfBats() {
        return typesOfBats;
    }

    public void setTypesOfBats(String typesOfBats) {
        this.typesOfBats = typesOfBats;
    }

    @Override
    public String food() {
        String output ="";    if(getTypesOfBats().equalsIgnoreCase("fruits")){
            output ="Бул жарганаттын тамагы :\n1)Момо- жемиштерден \n2)Гулдун нектарларынан турат";
        }else if(getTypesOfBats().equalsIgnoreCase("blood")){
            output = "Бул жарганаттар:\n1)Сут эмуучулордун канын сору";
        } return output;
    }

    @Override
    public String tasksRequired() {
        String out1 = "";
        String out2 = "";
        String output = "";

        if(getTimeOfDay().equalsIgnoreCase("тун")){
            out1 = "Жарганат тамак издеп жатат.";
        }else if (getTimeOfDay().equalsIgnoreCase("кун")){
            out1 = "Жарганат ункурдо уктап жатат.";
        }

        if(getSeason().equalsIgnoreCase("жупташуу мезгили")){
            out2 = "The bats reproduce.";
        }else {
            out2 = "The bats don't reproduce.";
            }

        output = out1+out2;
        return output;

    }

    @Override
    public boolean huntForFood() {
        return getTimeOfDay().equalsIgnoreCase("тун") && getLocation().equalsIgnoreCase("жайыт");
    }

    @Override
    public double dailyNorm() {
        if(canReproduce()){
            setMosquitoesEaten(4500);
        }else if(getSeason().equalsIgnoreCase("жай")){
            setMosquitoesEaten(10000);
        }else if(huntForFood()){
            setMosquitoesEaten(6000);
        }return getMosquitoesEaten();

    }


    public boolean canReproduce(){
        return huntForFood() &&
                getGender().equalsIgnoreCase("ургач") &&
                getSeason().equalsIgnoreCase("жупташуу мезгили");
    }

    @Override
    public String toString() {

        return "Bat{" +
                "height=" + getHeight()+ "\n"+
                "weight=" + getWeight()+"\n"+
                "location=" + getLocation()+"\n"+
                "time of day=" +getTimeOfDay()+"\n"+
                "season=" + getSeason()+"\n"+
                "gender=" + getGender()+"\n"+
                "mosquitoesEaten=" + mosquitoesEaten +"\n"+
                "typesOfBats='" + typesOfBats + '\'' +
                '}';
    }



}
