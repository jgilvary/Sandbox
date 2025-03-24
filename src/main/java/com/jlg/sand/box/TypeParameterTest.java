package com.jlg.sand.box;
import com.jlg.sand.dto.*;

import java.util.LinkedHashMap;
import java.util.Map;
public class TypeParameterTest {
        public static < K, V> void main (String[] args){
            System.out.println("start");

            Boolean myBoolean = false;
            Integer myInteger = 1;
            Double myDouble = 1.0;

            Map<K,V> testMap = new LinkedHashMap<>();
            testMap.put((K) "key1", (V) "value1");
            testMap.put((K) "key2Boolean", (V) myBoolean);
            testMap.put((K) "key2Integer", (V) myInteger);
            testMap.put((K) "key2Double", (V) myDouble);

            System.out.println("testMap=" + testMap);


            Map<Object, Object> test2Map = new LinkedHashMap<>();
            test2Map.put("key1", "value1");
            test2Map.put( "key2Boolean",  myBoolean);
            test2Map.put( "key2Integer",  myInteger);
            test2Map.put( "key2Double",  myDouble);

            System.out.println("test2Map=" + test2Map);


            Car car1 = new Car();
            car1.setColor("blue");
            car1.setMake("honda");
            car1.setModel("fit");
            car1.setWeight(2);
            car1.setPolished(false);
            car1.setTravelType();

            Apple apple1 = new Apple();
            apple1.setWeight(3);
            apple1.setPolished(true);

            Boat boat1 = new Boat();
            boat1.setTravelType();

            Box<Car> box1 = new Box<Car>();
            Box<Apple> box2 = new Box<Apple>();
            Box<Vehicle> box3 = new Box<Vehicle>();


            box1.setBoxItem(car1);
            box2.setBoxItem(apple1);
            box3.setBoxItem(boat1);


            Car o1 = box1.getBoxItem();
            Apple o2 = box2.getBoxItem();
            Vehicle o3 = box3.getBoxItem();

            String make = o1.getMake();
            Integer wght = o3.getWeight();
            String tt = o3.getTravelType();

            box3.setBoxItem(car1);

            o3 = box3.getBoxItem();
            String tt2 = o3.getTravelType();


            System.out.println("end");
            System.out.println("end");
        }
    }