package com.jlg.sand.dto;

public class Apple {
    private Integer weight;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getPolished() {
        return polished;
    }

    public void setPolished(Boolean polished) {
        this.polished = polished;
    }

    private Boolean polished;


    public void  bite(Integer biteWeight){
        weight =- biteWeight;
    }
}
