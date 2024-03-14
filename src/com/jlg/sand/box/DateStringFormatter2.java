package com.jlg.sand.box;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class DateStringFormatter2 {




        public static void main (String[] args){

            System.out.println("start");

            String dateStringFormat1 = "2024-03-12T08:08:08.008 UTC"; // Your input date string
            String dateStringFormat2 = "03-12-2024T08:08:08"; // Your input date string
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS zzz");
            SimpleDateFormat dateFormat2 = new SimpleDateFormat("MM-dd-yyyy'T'HH:mm:ss");


//            DateTimeFormatter dateFormatter;
//            dateFormatter = new DateTimeFormatter();

            try {
                Date d1 = dateFormat1.parse(dateStringFormat1);
                System.out.println("d1/f1=" + d1.toString());
            } catch (Exception e) {
                System.out.println("d1 did not parse format1");
            }
            try {
                Date d1 = dateFormat2.parse(dateStringFormat1);
                System.out.println("d1/f2=" + d1.toString());
            } catch (Exception e) {
                System.out.println("d1 did not parse format2");
            }

            try {
                Date d2 = dateFormat1.parse(dateStringFormat2);
                System.out.println("d2/f1=" + d2.toString());
            } catch (Exception e) {
                System.out.println("d2 did not parse format1");
            }
            try {
                Date d2 = dateFormat2.parse(dateStringFormat2);
                System.out.println("d2/f2=" + d2.toString());
            } catch (Exception e) {
                System.out.println("d2 did not parse format2");
            }



            System.out.println("end");
        }


    }