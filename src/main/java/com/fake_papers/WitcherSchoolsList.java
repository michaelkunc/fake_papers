package com.fake_papers;

public enum WitcherSchoolsList {
    CAT ("The School of The Cat"), 
    WOLF ("The School of The Wolf"), 
    BEAR ("The School of The Bear"), 
    VIPER ("The School of The Viper"), 
    MANTICORE ("The School of The Manticore");

    private String value; 

    public String getValue(){
        return value;
    }

    private WitcherSchoolsList(String value){
        this.value = value;
    }


}