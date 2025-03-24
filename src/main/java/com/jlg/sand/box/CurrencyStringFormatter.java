package com.jlg.sand.box;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyStringFormatter {

        public static void main (String[] args){
            System.out.println("start");

            showCurrencies("1111");
            showCurrencies("2222.22");
            showCurrencies("-33333333");
            showCurrencies(".04");
            showCurrencies("$555.05");
            showCurrencies("$66,666.66");
            showCurrencies("77Million");
            showCurrencies("88.8$");
            showCurrencies("  ,,$9.$$9,,$$  ");
            showCurrencies("bannana");
            System.out.println(" ");
            System.out.println("end");
        }




    private static void showCurrencies(String moneyString){
//        System.out.println(" ");
        System.out.println("moneyString=" + moneyString + " US result=" + moneyFormatter(moneyString, Locale.US));
//        System.out.println("moneyString=" + moneyString + " CANADA result=" + moneyFormatter(moneyString, Locale.CANADA));
//        System.out.println("moneyString=" + moneyString + " FRANCE result=" + moneyFormatter(moneyString, Locale.FRANCE));
//        System.out.println("moneyString=" + moneyString + " UK result=" + moneyFormatter(moneyString, Locale.UK));
    }


        private static String moneyFormatter(String currencyInString, Locale locale) {
                try{
                    BigDecimal valueToFormat = new BigDecimal(currencyInString.replace("$", "").replace(",","").trim());
                    String formattedString = NumberFormat.getCurrencyInstance(locale).format(valueToFormat);
                    return formattedString;
                } catch (NumberFormatException e) {
                    return currencyInString;
                }

        }


    }