package com.jlg.sand.box;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DavidMethodReference2 {

    static void someFunction(String s)
    {
        String something = "something";
        System.out.println(s);
    }

    public static void main(String[] args)
    {

        List<String> list = new ArrayList<>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");

        list.forEach(DavidMethodReference2::someFunction);
//        list.forEach(s->DavidMethodReference2.someFunction(s));
//        for (String s : list) {DavidMethodReference2.someFunction(s);}

    }}