package com.jlg.sand.box;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class DateStringTest {





    public static void main (String[] args){

        System.out.println("start");

        String datea = "09/22/1951";
        String dateb = "1951-09-22";
        String datec = "Sept 09 1951";
        String dated = "09-22-1951";

        System.out.println("do for datea=" + datea + " result =" + dateFormatter(datea));
        System.out.println("do for dateb=" + dateb + " result =" + dateFormatter(dateb));
        System.out.println("do for datec=" + datec + " result =" + dateFormatter(datec));
        System.out.println("do for dated=" + dated + " result =" + dateFormatter(dated));

        System.out.println("end");
    }

    private static String dateFormatter(String dateString) {

//        Pattern pattern = Pattern.compile("/[0-1][0-9]/[0-3][0-9]/[0-9][0-9][0-9][0-9]/");
//        Matcher matcher = pattern.matcher(URL);


        String humanFormat = "mm/dd/yyyy";
        String machineFormat = "yyyy-mm-dd";
        DateFormat df = new SimpleDateFormat(machineFormat);
        try {
            Date date = new SimpleDateFormat(humanFormat).parse(dateString);
            return  df.format(date);
        } catch (ParseException e) {
            try {
                Date date = new SimpleDateFormat(machineFormat).parse(dateString);
                return df.format(date);
            } catch (ParseException ex) {
                return "not parsable! " + dateString;
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}


