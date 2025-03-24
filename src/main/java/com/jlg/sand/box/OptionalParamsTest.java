package com.jlg.sand.box;

public class OptionalParamsTest {

        public static void main (String[] args){
            System.out.println("start");

            String stringTrue = "true";
            Object booString = (Object) stringTrue;

            testMethod("joe");
            testMethod();

            System.out.println("end");
        }

    private static void testMethod() {
            testMethod("sally");
    }

    private static void testMethod(String inString ) {
        System.out.println("testString=" + inString);
    }


}