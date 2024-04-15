package com.jlg.sand.box;
import java.util.LinkedHashMap;
import java.util.Map;
public class InstanceOfTest {
    public static void main (String[] args){
        System.out.println("start");
        Map<String,Object> someMap = new LinkedHashMap<>();
        Map<String,Object> anotherMap = new LinkedHashMap<>();
        //someMap.put("aKey", true);
        anotherMap.put("bKey", "apple");
        String theString = "";

        theString = anotherMap.get("bKey") instanceof String mapString ? mapString :"nada";

        System.out.println("theString is=" + theString);
        System.out.println("the map is=" + someMap.toString());
        if (someMap.get("aKey") instanceof String) {
            System.out.println("it is instanceof a string");
        } else {
            System.out.println("it is not instanceof a string");
        }
        System.out.println("end");
    }
}