package com.jlg.sand.box;

import java.util.*;

public class SortSandbox {
    public static void main (String[] args){
        System.out.println("entering sort sandbox");



        LinkedHashMap m1 = new LinkedHashMap();
        m1.put("name","Joe");
        m1.put("favoriteColor","blue");
        m1.put("date","2020-01-01");

        LinkedHashMap m2 = new LinkedHashMap();
        m2.put("name","Al");
        m2.put("favoriteColor","yellow");
        m2.put("date","2024-01-01");

        LinkedHashMap m3 = new LinkedHashMap();
        m3.put("name","Frank");
        m3.put("favoriteColor","green");
        m3.put("date","2029-01-01");

        LinkedHashMap m4 = new LinkedHashMap();
        m4.put("name","Sam");
        m4.put("favoriteColor","red");
        m4.put("date","2026-01-01");

        ArrayList<LinkedHashMap> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        sorter(list, "name");
        sorter(list, "favoriteColor");
        sorter(list, "date");

        System.out.println("leaving sort sandbox");

    }

    private static void sorter(ArrayList<LinkedHashMap> list, String sortby) {
        System.out.println("before sort sorting by " + sortby + "  values=" + list.toString());
        Collections.sort(list, new Comparator<LinkedHashMap>(){
            public int compare(LinkedHashMap o1, LinkedHashMap o2) {
                String o1Key = (String) o1.get(sortby);
                String o2Key = (String) o2.get(sortby);
                return o1Key.compareTo(o2Key);
            }
        });
        System.out.println("after sort" + list.toString());
    }
}
