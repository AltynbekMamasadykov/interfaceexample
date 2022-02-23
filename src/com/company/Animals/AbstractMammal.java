package com.company.Animals;

import com.company.Animals.AbstractAnimal;

public class AbstractMammal extends AbstractAnimal {

    public AbstractMammal(double height, int weight, String location, String timeOfDay, String season, String gender) {
        super(height, weight, location, timeOfDay, season, gender);
    }

    @Override
    public boolean canReproduce() {
        return false;
    }
}
