package com.jlg.sand.box;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.*;

public class EmbeddedMap {

        public static void main (String[] args){
            System.out.println("start");

            Map outterMap = new LinkedHashMap<>();
            Map innerMap = new LinkedHashMap();
            List theList = new ArrayList();
            theList.add("joe");
            theList.add("bob");
            innerMap.put("maptype", "namelist");
            innerMap.put("namelist", theList);
            outterMap.put("things", innerMap);

            System.out.println("map->" + outterMap);

            if (outterMap instanceof LinkedHashMap<?,?> )


            System.out.println(" ");
            System.out.println("end");
        }




}