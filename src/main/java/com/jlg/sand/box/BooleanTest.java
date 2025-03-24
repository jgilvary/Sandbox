package com.jlg.sand.box;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class BooleanTest {

        public static void main (String[] args){
            System.out.println("start");

            String stringTrue = "true";
            Object booString = (Object) stringTrue;
            Boolean wrapperboolean = false;
            boolean primativebooleand= false;

            //primativebooleand = (boolean) booString;
            wrapperboolean = (Boolean) booString;

            //System.out.println("primativebooleand" + primativebooleand);
            System.out.println("wrapperboolean" + wrapperboolean);



            System.out.println(" ");
            System.out.println("end");
        }






    }