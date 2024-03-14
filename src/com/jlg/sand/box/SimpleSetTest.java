package com.jlg.sand.box;

import java.util.*;

public class SimpleSetTest {
    public static void main (String[] args){
        System.out.println("start");
        testHashSet();
        testTreeSet();
        testLinkedHashset();
        System.out.println("end");
    }
    private static void testHashSet() {
        System.out.println("testHashSet");
        HashSet hs = new HashSet();
        Object obj1 = "bannana";
        Object obj2 = 2;
        hs.add(obj1);
        hs.add(obj2);
        hs.add("bannana"); //since strings immutable, I would have thought there would be two bannanas.
        hs.add(2);
        System.out.println("hs size = " + hs.size());
        System.out.println("hs = " + hs.toString());
    }
    private static void testTreeSet() {
        System.out.println("testTreeSet");
        TreeSet ts = new TreeSet();
        ts.add("orange");
        ts.add("bannana");
        ts.add("apple");
        ts.add("bannana");
        //ts.add(2); //this would produce class cast exception as it doesn't match otehr set members
        System.out.println("ts size = " + ts.size());
        System.out.println("ts = " + ts.toString());
    }
    private static void testLinkedHashset() { //like hashset, maintains insertion order
        System.out.println("testLinkedHashset");
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("rose");
        lhs.add("daisy");
        lhs.add("violet");
        lhs.add("daisy");
        System.out.println("lhs size = " + lhs.size());
        System.out.println("lhs = " + lhs.toString());
    }

}
