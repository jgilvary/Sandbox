package com.jlg.sand.box;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TernTest {





    public static void main (String[] args){

        System.out.println("start TernTest");

        String st = "KY";
        if (st.equals("IN")) {
            System.out.println("Indiana");
        } else
        {if (st.equals("OH")) {
            System.out.println("Ohio");
        } else {if (st.equals("KY")) {
            System.out.println("Kentucky");
        } else {if (st.equals("MI")) {
            System.out.println("Michigan");
        } else if (st.equals("NY")) {
            System.out.println("NewYork");
        } else {
            System.out.println("unknown");
        }}}}
//        String longName =  st.equals("OH") ?
//            "Ohio" : st.equals("KY") ?
//            "Kentucky"  : "unknown";

        System.out.println("state short name =" + st);
//        System.out.println("state long name =" + longName);
        System.out.println("end TestTest");
    }



}


