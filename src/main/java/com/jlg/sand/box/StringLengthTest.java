package com.jlg.sand.box;

public class StringLengthTest {
    public static void main (String[] args){
        System.out.println("entering StringLengthTest-------------");
        String testString = "abcdefg";
//        substringSafeTest(testString,0, 10);
//        substringSafeTest(testString,0, 3);
//        substringSafeTest(testString,2, 1);
//        substringSafeTest(testString,-1, 2);
//        substringSafeTest(testString,0, -3);
        substringSafeTest(testString,22, 1222);
        System.out.println("leaving StringLengthTest--------------");
    }
    public static String substringSafeTest(String unSafeString, Integer start, Integer end) {
        System.out.println("string before (" + unSafeString + ") for start " + start + "  and end " + end);
        String newString = substringSafe(unSafeString,start, end);
        System.out.println("string after (" + newString + ")");
        return  newString;
    }

    public static String substringSafe(String unSafeString, Integer start, Integer end) {

        String returnString = "";
        Integer stringLen = unSafeString.length();

        if (end > stringLen) end=stringLen;
        else if (end < 0) end = 0;
        else if (end < start) end=start;

        if (start > stringLen) start = stringLen;
        else if (start< 0) start =0;
        else if (start > end) start = end;

        returnString =  unSafeString.substring(start, end);

        return  returnString;
    }


}
