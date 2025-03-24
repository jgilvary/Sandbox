package com.jlg.sand.box;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DavidCodeTest {

    public static void main (String[] args){
        System.out.println("start DavidCodeTest");

        Object dataObject = new Object();

//        LinkedHashMap<String, Object> data = (dataObject instanceof LinkedHashMap<?, ?> tempMap) ?
//            tempMap.entrySet().stream()
//                .filter(entry -> entry.getKey() instanceof String && entry.getValue() != null)
//                .collect(Collectors.toMap(e -> (String) e.getKey(), Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new))


        System.out.println("end DavidCodeTest");
    }
}
