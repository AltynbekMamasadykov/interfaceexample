package com.company.Animals;

import com.company.Interfaces.AnimalsInterface;

public class Bear extends AbstractMammal implements AnimalsInterface {
    private int cub=0;  //мамалактары
    private int poundsOfFood; // сколько кг сьел

    public Bear(double height, int weight, String location, String timeOfDay, String season, String gender) {
        super(height, weight, location, timeOfDay, season, gender);
    }

    public int getCub() {
        return cub;
    }

    public void setCub(int cub) {
        this.cub = cub;
    }

    public int getPoundsOfFood() {
        return poundsOfFood;
    }

    public void setPoundsOfFood(int poundsOfFood) {
        this.poundsOfFood = poundsOfFood;
    }


    @Override
    public String food() {
        String out ="";
        if(this.getSeason().equalsIgnoreCase("кыш")){
        out = "Кышта аю уктайт,эч нерсе жебейт";
        }else if (this.getSeason().equalsIgnoreCase("жай")){
            out = "жайда аю балык жейт";
        }return out;
    }

    @Override
    public String tasksRequired() {
        String out ="";
        if(getSeason().equalsIgnoreCase("кыш")){
            out = "укта,укта жана укта";
        }else if((getSeason().equalsIgnoreCase("жай")) && getTimeOfDay().equalsIgnoreCase("тун")){
            out = "кандай сонун эс алуу";
        }else if((getSeason().equalsIgnoreCase("жай")) && getTimeOfDay().equalsIgnoreCase("кун")){
            out = "охотага чыгуу керек,болбосо ачка калабыз";
        }return out;
    }

    @Override
    public double dailyNorm() {
        double dailyNorm = -1.0;
        if(getPoundsOfFood()==90 && getSeason().equalsIgnoreCase("куз")){
           dailyNorm = 90*2;
        }if(getCub()>0){
            dailyNorm = getPoundsOfFood()*((getCub()/2+2));
        }return dailyNorm;
    }

    @Override
    public boolean huntForFood() {
        return getTimeOfDay() != "тун" && getSeason() != "кыш" && getLocation() != "берлога";
    }

    public double amountFood(){
        if(huntForFood()){
            setPoundsOfFood(90);
        }return getPoundsOfFood();
    }

    public boolean canReproduce(){
        if(huntForFood() &&
                getGender().equalsIgnoreCase("ургач") &&
                getSeason().equalsIgnoreCase("жупташуу мезгили")){
            setCub(getCub()+1);
        }return true;
    }

    @Override
    public String toString() {
        return "Bear{" +
                "cub=" + cub +"\n"+
                "poundsOfFood=" + poundsOfFood +"\n"+
                "height=" + getHeight()+ "\n"+
                "weight=" + getWeight()+"\n"+
                "location=" + getLocation()+"\n"+
                "time of day=" +getTimeOfDay()+"\n"+
                "season=" + getSeason()+"\n"+
                "gender=" + getGender()+"\n"+
                '}';
    }
}

