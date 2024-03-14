package com.jlg.sand.box;

public class DateStringTest {

    public static void main (String[] args){
        String driverOnOrderDOB = "09/22/1951";
        String driverInErrorDOB = "1951-09-22";


        System.out.println("before values----------------------");
        System.out.println("driverOnOrderDOB=(" + driverOnOrderDOB + ")");
        System.out.println("driverInErrorDOB=(" + driverInErrorDOB+ ")");

        System.out.println("start");



        //copy from here to

        boolean dateSame = false;

        String driverOnOrderFormat = "";
        String driverInErrorFormat = "";


        String driverOnOrderYear ="";
        String driverInErrorYear = "";
        String driverOnOrderMonth ="";
        String driverInErrorMonth = "";
        String driverOnOrderDay ="";
        String driverInErrorDay = "";

        if ((driverOnOrderDOB.charAt(2) < '0' ||  driverOnOrderDOB.charAt(2) > '9')
            &&    (driverOnOrderDOB.charAt(5) < '0' ||  driverOnOrderDOB.charAt(2) > '5')){
            driverOnOrderMonth = driverOnOrderDOB.substring(0,2);
            driverOnOrderDay = driverOnOrderDOB.substring(3, 5);
            driverOnOrderYear = driverOnOrderDOB.substring(6, 10);
            driverOnOrderFormat = "mm/dd/yyyy";
        }

        if ((driverInErrorDOB.charAt(2) < '0' ||  driverInErrorDOB.charAt(2) > '9')
            &&    (driverInErrorDOB.charAt(5) < '0' ||  driverInErrorDOB.charAt(2) > '5')){
            driverInErrorMonth = driverInErrorDOB.substring(0,2);
            driverInErrorDay = driverInErrorDOB.substring(3, 5);
            driverInErrorYear = driverInErrorDOB.substring(6, 10);
            driverInErrorFormat = "mm/dd/yyyy";
        }


        if ((driverOnOrderDOB.charAt(4) < '0' ||  driverOnOrderDOB.charAt(4) > '9')
            &&    (driverOnOrderDOB.charAt(7) < '0' ||  driverOnOrderDOB.charAt(7) > '5')){
            driverOnOrderYear = driverOnOrderDOB.substring(0, 4);
            driverOnOrderMonth = driverOnOrderDOB.substring(5, 7);
            driverOnOrderDay = driverOnOrderDOB.substring(8,10);
            driverOnOrderFormat = "yyyy/mm/dd";
        }

        if ((driverInErrorDOB.charAt(4) < '0' ||  driverInErrorDOB.charAt(4) > '9')
            &&    (driverInErrorDOB.charAt(7) < '0' ||  driverInErrorDOB.charAt(7) > '5')){
            driverInErrorYear = driverInErrorDOB.substring(0, 4);
            driverInErrorMonth = driverInErrorDOB.substring(5, 7);
            driverInErrorDay = driverInErrorDOB.substring(8,10);
            driverInErrorFormat = "yyyy/mm/dd";
        }

        if (driverInErrorYear.equalsIgnoreCase(driverOnOrderYear) &&
            driverInErrorMonth.equalsIgnoreCase(driverOnOrderMonth) &&
            driverInErrorDay.equalsIgnoreCase(driverOnOrderDay) ){
            dateSame = true;
        }

        //copy to here

        System.out.println("after values----------------------");
        System.out.println("driverInErrorFormat=(" + driverInErrorFormat+ ")");
        System.out.println("driverInErrorYear=(" + driverInErrorYear+ ")");
        System.out.println("driverInErrorMonth=(" + driverInErrorMonth+ ")");
        System.out.println("driverInErrorDay=(" + driverInErrorDay+ ")");
        System.out.println("driverOnOrderFormat=(" + driverOnOrderFormat+ ")");
        System.out.println("driverOnOrderYear=(" + driverOnOrderYear+ ")");
        System.out.println("driverOnOrderMonth=(" + driverOnOrderMonth+ ")");
        System.out.println("driverOnOrderDay=(" + driverOnOrderDay+ ")");
        System.out.println("dateSame=(" + dateSame+ ")");

        System.out.println("end");
    }

}
