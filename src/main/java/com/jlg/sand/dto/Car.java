package com.jlg.sand.dto;

public class Car implements Vehicle{
    public Integer getWheels() {
        return wheels;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public void setTravelType() {
        travelType = "land";
    }

    @Override
    public String getTravelType() {
        return travelType;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private final Integer wheels = 4;
    private Integer weight;
    private String color;
    private String make;
    private String model;
    private String travelType;

    public Boolean getPolished() {
        return polished;
    }

    public void setPolished(Boolean polished) {
        this.polished = polished;
    }

    private Boolean polished;
}
