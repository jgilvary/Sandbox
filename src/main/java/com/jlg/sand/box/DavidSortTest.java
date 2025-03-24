package com.jlg.sand.box;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DavidSortTest {


    public static void main (String[] args){
        System.out.println("start DavidCodeTest");

        Object dataObject = new Object();

        List<String> buAccess1 = new ArrayList<>();
        buAccess1.add("@ the party");

        buAccess1.add("1 man");
        buAccess1.add("hotdog");
        buAccess1.add("# the ground");
        buAccess1.add("catdog");
        buAccess1.add("2 guys");
        List<String> buAccess2 = new ArrayList<>();
        buAccess2.add("hotdog");
        buAccess2.add("# the ground");
        buAccess2.add("catdog");
        buAccess2.add("2 man");
        buAccess2.add("@ the party");
        buAccess2.add("1 guys");
        List<String> buAccess3 = new ArrayList<>();
        buAccess3.add("1 man");
        buAccess3.add("@ the party");
        buAccess3.add("2 guys");
        buAccess3.add("hotdog");
        buAccess3.add("catdog");
        buAccess3.add("# the ground");


        System.out.println("before buAccess1" + buAccess1);
        System.out.println("before buAccess2" + buAccess2);
        System.out.println("before buAccess3" + buAccess3);

        buAccess1.sort((String a, String b) -> {
            if (Character.isDigit(a.charAt(0)) && !Character.isDigit(b.charAt(0))) {
                return -1;
            } else if (!Character.isDigit(a.charAt(0)) && Character.isDigit(b.charAt(0))) {
                return 1;
            } else {
                return a.compareTo(b);
            }
        });

        buAccess2.sort((String a, String b) -> {
            if (Character.isDigit(a.charAt(0)) && !Character.isDigit(b.charAt(0))) {
                return -1;
            } else if (!Character.isDigit(a.charAt(0)) && Character.isDigit(b.charAt(0))) {
                return 1;
            } else {
                return a.compareTo(b);
            }
        });

        buAccess3.sort((String a, String b) -> {
            if (Character.isDigit(a.charAt(0)) && !Character.isDigit(b.charAt(0))) {
                return -1;
            } else if (!Character.isDigit(a.charAt(0)) && Character.isDigit(b.charAt(0))) {
                return 1;
            } else {
                return a.compareTo(b);
            }
        });



        System.out.println("after buAccess1" + buAccess1);
        System.out.println("after buAccess2" + buAccess2);
        System.out.println("after buAccess3" + buAccess3);


        System.out.println("end DavidCodeTest");
    }
}
