package com.jlg.sand.box;

public class StringFormat {
    public static void main(String[] args) {
        System.out.println("entering StringFormat-------------");
        String s1 = "joe";
        String s2 = " is ";
        String s3 = " cool ";
        String s4 = "";
        s4 = String.format("testing string format %s %s %s  ", s1, s2, s3);
        System.out.println("s4=" + s4);
        System.out.println("leaving StringFormat--------------");
    }
}