package com.jlg.sand.box;

import com.jlg.sand.dto.Vehicle;

public class InterfacePlay {


    public static void main(String[] args) {
        System.out.println("start InterfacePlay");
        Vehicle v1;
        Vehicle v2;
        v1 = testFunctionality("Jan");
        v2 = testFunctionality("Feb");
        v1.park();
        v1.drive();
        v2.park();
        v2.drive();
        System.out.println("end InterfacePlay");
    }

    private static Vehicle testFunctionality(String month) {
        Vehicle vehicle;
        if (month.equals("Jan")) {
            vehicle = new Truck();
        } else {
            vehicle = new Car();
        }
        return vehicle;
    }

    interface Vehicle {
        void drive();
        void park();
    }
    static class Car implements Vehicle {
        @Override
        public void drive() {
            System.out.println("feel free to use the high speed lane");
        }
        public void park() {
            System.out.println("park anywhere you want");
        }
    }
    static class Truck implements Vehicle {
        @Override
        public void drive() {
            System.out.println("use low speed lane for saftey");
        }
        public void park() {
            System.out.println("need a big space");
        }
    }
}
