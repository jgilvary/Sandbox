package com.jlg.sand.dto;

public class Boat implements Vehicle{
    private Integer weight;
    private String travelType;

    public Integer getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }

    private Integer displacement;

    public Integer getWeight() {
        return weight;
    }


    public void setTravelType() {
        travelType = "sea";

    }
    public  String getTravelType(){
        return travelType;
    }
}
