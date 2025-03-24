package com.jlg.sand.dto;

public class Box<T> {
    // T stands for "Type"
    private T t;

    public void setBoxItem(T t) { this.t = t; }
    public T getBoxItem() { return t; }
}




