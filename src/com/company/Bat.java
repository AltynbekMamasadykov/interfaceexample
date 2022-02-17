package com.company;

public class Bat extends AbstractMammal implements AnimalsInterface{
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
        String output ="";
        if(this.getTypesOfBats().equalsIgnoreCase("fruits")){
            output ="Бул жарганаттын тамагы :\n1)Момо- жемиштерден \n2)Гулдун нектарларынан турат";
        }else if(this.getTypesOfBats().equalsIgnoreCase("blood")){
            output = "Бул жарганаттар:\n1)Сут эмуучулордун канын сору";
        } return output;
    }

    @Override
    public String tasksRequired() {

        String output = "";
        if(this.getTimeOfDay().equalsIgnoreCase("тун")){
            output = "Жарганат тамак издеп жатат.";
        }else if (this.getTimeOfDay().equalsIgnoreCase("жупташуу мезгили")){
            output = "The bats reproduce.";
        }else if (this.getTimeOfDay().equalsIgnoreCase("кундуз")){
            output = "Жарганат ункурдо уктап жатат.";
        }return output;

    }

    @Override
    public boolean huntForFood() {
        return this.getTimeOfDay().equalsIgnoreCase("тун") && this.getLocation().equalsIgnoreCase("жайыт");
    }

    @Override
    public double dailyNorm() {
        if(this.canReproduce()){
            this.setMosquitoesEaten(4500);
        }else if(this.getSeason().equalsIgnoreCase("жай")){
            this.setMosquitoesEaten(10000);
        }else if(this.huntForFood()){
            this.setMosquitoesEaten(6000);
        }return (double)getMosquitoesEaten();

    }

    public boolean canReproduce(){
        return this.huntForFood() &&
                this.getGender().equalsIgnoreCase("ургач") &&
                this.getSeason().equalsIgnoreCase("жупташуу мезгили");
    }

    @Override
    public String toString() {
        return "Bat{" +
                "mosquitoesEaten=" + mosquitoesEaten +
                ", typesOfBats='" + typesOfBats + '\'' +
                '}';
    }
}
