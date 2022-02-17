package com.company;

public class Bear extends AbstractMammal implements AnimalsInterface{
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
            out = ";жайда аю балык жейт";
        }return out;
    }

    @Override
    public String tasksRequired() {
        String out ="";
        if(this.getSeason().equalsIgnoreCase("кыш")){
            out = "укта,укта жана укта";
        }else if((this.getSeason().equalsIgnoreCase("жай")) && this.getTimeOfDay().equalsIgnoreCase("тун")){
            out = "кандай сонун эс алуу";
        }else if((this.getSeason().equalsIgnoreCase("жай")) && this.getTimeOfDay().equalsIgnoreCase("кун")){
            out = "охотага чыгуу керек,болбосо ачка калабыз";
        }return out;
    }

    @Override
    public double dailyNorm() {
        if(this.getPoundsOfFood()==90 && this.getSeason().equalsIgnoreCase("куз")){
            this.setPoundsOfFood(this.getPoundsOfFood()*2);
        }if(this.getCub()>0){
            this.setPoundsOfFood(this.getPoundsOfFood()*((getCub()/2+2)));
        }return this.getPoundsOfFood();
    }

    @Override
    public boolean huntForFood() {
        return this.getTimeOfDay() != "тун" && this.getSeason() != "кыш" && this.getLocation() != "берлога";
    }

    public double amountFood(){
        if(this.huntForFood()){
            this.setPoundsOfFood(90);
        }return this.getPoundsOfFood();
    }

    public boolean canReproduce(){
        if(this.huntForFood() &&
                this.getGender().equalsIgnoreCase("ургач") &&
                this.getSeason().equalsIgnoreCase("жупташуу мезгили")){
            this.setCub(this.getCub()+1);
        }return true;
    }

    @Override
    public String toString() {
        return "Bear{" +
                "cub=" + cub +
                ", poundsOfFood=" + poundsOfFood +
                '}';
    }
}
