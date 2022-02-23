package com.company.Animals;

import com.company.Animals.AbstractAnimal;

public abstract class AbstractReptile extends AbstractAnimal {
    private int length; //длина
    private String vision; //зрение
    private String hearingAbilities; //способности слышать
    private String typeOfReproduction;

    public AbstractReptile(double height, int weight, String location, String timeOfDay, String season, String gender, int length, String vision, String hearingAbilities, String typeOfReproduction) {
        super(height, weight, location, timeOfDay, season, gender);
        this.length = length;
        this.vision = vision;
        this.hearingAbilities = hearingAbilities;
        this.typeOfReproduction = typeOfReproduction;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getHearingAbilities() {
        return hearingAbilities;
    }

    public void setHearingAbilities(String hearingAbilities) {
        this.hearingAbilities = hearingAbilities;
    }

    public String getTypeOfReproduction() {
        return typeOfReproduction;
    }

    public void setTypeOfReproduction(String typeOfReproduction) {
        this.typeOfReproduction = typeOfReproduction;
    }


    public abstract void abilitiesOfCrawling();


}
