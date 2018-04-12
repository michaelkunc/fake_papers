package com.fake_papers;

import java.util.Random;


public class WitcherSchool {

    private final String witcherschool;
    private final Random random = new Random();

    public WitcherSchool(){
        int index = random.nextInt(WitcherSchoolsList.values().length);
        this.witcherschool = WitcherSchoolsList.values()[index].getValue();

    }

    public String getWitcherSchool(){
        return witcherschool;
    }
}