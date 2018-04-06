package com.fake_papers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class WitcherSchool {

    private final String witcherschool;
    private final Random random = new Random();

    public WitcherSchool(){
        // List <String> schools = new ArrayList<String>();
        // schools.add("The School of The Cat");
        // schools.add("The School of The Wolf");
        // schools.add("The School of The Bear");
        // schools.add("The School of The Viper");
        // schools.add("The School of The Manticore");

        // int index = random.nextInt(schools.size());
        // this.witcherschool = schools.get(index);
        int index = random.nextInt(WitcherSchoolsList.values().length);
        this.witcherschool = WitcherSchoolsList.values()[index].toString();

    }

    public String getWitcherSchool(){
        return witcherschool;
    }
}