package com.fake_papers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Occupation {
    
    private final String occupation;
    private final Random random = new Random();

    public Occupation(){
        List<String> occupations = new ArrayList<String>();
        occupations.add("Emperor");
        occupations.add("Witcher");
        occupations.add("Soldier");
        occupations.add("Sorceress");
        occupations.add("Sorcerer");

        int index = random.nextInt(occupations.size());
        this.occupation = occupations.get(index);
    }

    public String getOccupation(){
        return occupation;
    }
}
