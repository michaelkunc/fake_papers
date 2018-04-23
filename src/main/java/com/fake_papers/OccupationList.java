package com.fake_papers;

public enum OccupationList {
    EMPEROR ("Emperor"),
    WITCHER ("Witcher"),
    SOLDIER ("Soldier"),
    SOCERERESS ("Soceress"),
    SOCERER ("Socerer"),
    TAVERN_OWNER ("Tavern Owner"),
    TAVERN_WENTCH ("Tavern Wentch"),
    PROFESSOR ("Professor"),
    DOCTOR ("Doctor");

    private String value;

    public String getValue(){
        return value;
    }

    private OccupationList(String value){
        this.value = value;
    }
}
 