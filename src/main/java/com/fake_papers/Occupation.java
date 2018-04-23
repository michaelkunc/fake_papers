package com.fake_papers;

import java.util.Random;

public class Occupation {
    
    private final String occupation;
    private final Random random = new Random();

    public Occupation(){

        int index = random.nextInt(OccupationList.values().length);
        this.occupation = OccupationList.values()[index].getValue();
    }

    public String getOccupation(){
        return occupation;
    }
}
