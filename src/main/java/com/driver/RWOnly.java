package com.driver;

public class RWOnly {
    private String name;

    public String readOnly(){
        return name;
    }

    public void writeOnly(String name){
        this.name = name;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }


}
