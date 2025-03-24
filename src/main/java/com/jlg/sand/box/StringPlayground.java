package com.jlg.sand.box;

public class StringPlayground {
    public static void main(String[] args) {
        System.out.println("StringPlayground");
        String startString ="abcGD-$@#%O'ma-jone%)";
        System.out.println("startString="+startString);
        String expectedString ="abcGD-O'ma-jone";
        System.out.println("expectedString=" + expectedString);
        String endString = startString.replaceAll("[^\\w\\s\\-\\']","");
        System.out.println("endString  ="+endString);

    }
}
