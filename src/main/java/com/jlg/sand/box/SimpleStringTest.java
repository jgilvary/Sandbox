package com.jlg.sand.box;


import java.nio.charset.StandardCharsets;

public class SimpleStringTest {
    public static void main (String[] args){
        System.out.println("start");
//        String teststring1 = "987654321";
//        String teststring2 = "12-3456789";
//        String teststring = teststring1;
//        String nullString = null;
//        String emptyString = "";
//        if (emptyString.equals("")) {
//            System.out.println("test worked for empty string");
//        }
//        if (nullString == null) {
//            System.out.println("test worked for null string");
//        }
//
//        //String teststring = teststring2;
//        String resultString = "";
//        System.out.println("----------");
//        System.out.println("teststring               =" + teststring);
//        System.out.println("teststring.substring(0,9)=" + teststring.substring(0,9));
//        System.out.println("teststring.substring(0,8)=" + teststring.substring(0,8));
//        //System.out.println("teststring.substring(0,10)=" + teststring.substring(0,10));
//        System.out.println("----------");
//        System.out.println("using=" + teststring);
//        resultString = teststring.charAt(2) != '-' ? teststring.substring(0,2) + "-" + teststring.substring(2,9) : teststring;
//        System.out.println("resultString=" + resultString);
//        System.out.println("");
//        teststring = teststring2;
//        System.out.println("using=" + teststring);
//        resultString = teststring.charAt(2) != '-' ? teststring.substring(0,2) + "-" + teststring.substring(2,9) : teststring;
//        System.out.println("resultString=" + resultString);
//
//        String name = "A  non @ ascii © letter here  Â  did ® it get ¥ removed";
//
//        System.out.println("before removing non-ascii "+ name);
//        StringBuilder result = new StringBuilder();
//        for(char val : name.toCharArray()) {
//            if((val > 64 && val < 91) || (val > 96 && val < 123) || (val == 32) ) result.append(val);
//        }
//        System.out.println("Result removing non-ascii "+result.toString());
//
//        //https://www.baeldung.com/java-string-encode-utf-8
//        String germanString = "Entwickeln Sie mit Vergnügen";
//        byte[] germanBytes = germanString.getBytes();
//
//        String asciiEncodedString = new String(germanBytes, StandardCharsets.US_ASCII);
//        System.out.println("germanString "+germanString);
//        System.out.println("Result removing non-ascii "+asciiEncodedString.toString());
//
//        //using same thing with my string
//
//        byte[] namebytes = name.getBytes();
//        String asciiEncodedString2 = new String(namebytes, StandardCharsets.US_ASCII);
//        System.out.println("name "+name);
//        System.out.println("Result removing non-ascii from name "+asciiEncodedString2.toString());


//        int myint = 2000000000;
//        long mylong = 3000000000L;
//        long anotherlong;
//        int anotherint;
//
//        anotherlong = myint;
//        anotherint = mylong;





        Float myFloat = (float) 19.99F;
        System.out.println ("format=" +  String.format("%.1f", myFloat));


        System.out.println("end");
    }


}
