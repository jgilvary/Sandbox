package com.jlg.sand.box;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DavidMethodReference {

    //this is a better documentation..
    //https://www.geeksforgeeks.org/double-colon-operator-in-java/
    public static void main (String[] args){
        System.out.println("start DavidCodeTest");

        class Hey {
            public double square(double num) {
                return Math.pow(num, 2);
            }
        }

        Hey hey = new Hey();
        Function<Double, Double> square = hey::square;
        double ans1 = square.apply(3d);
        double ans2 = hey.square(2d);

        System.out.println("ans1 is " + ans1);
        System.out.println("ans2 is " + ans2);

        System.out.println("end DavidCodeTest");
    }
}
