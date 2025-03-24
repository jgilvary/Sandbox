package com.jlg.sand.box;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringSandbox {

    public static void main(String[] args) {
        System.out.println("StringPlayground begin");
//        testSpecialChar();
        testSpecialCharGuesses();
        System.out.println("StringPlayground end");
    }

    public static void testSpecialChar () {
        System.out.println("testSpecialChar------");
        List<String>listOfStrings = getListOfStrings();
        for (String aString : listOfStrings) {
            processString(aString);
        }
    }
    public static void testSpecialCharGuesses () {
        System.out.println("testSpecialCharGuesses------");
        List<String>listOfStrings = getListOfStrings();
        for (String aString : listOfStrings) {
            processStringGuesses(aString);
        }
    }
    public static void processString (String theString) {
        System.out.println("bef ="+ theString);
        String after = theString.replaceAll("[^\\w\\s\\-\\']","");
        System.out.println("aft ="+ after);
    }
    public static void processStringGuesses (String theString) {
        System.out.println("before="+ theString);

        String norm1String = Normalizer.normalize(theString, Normalizer.Form.NFKD);
        System.out.println("norm1 ="+ norm1String);
        String norm2String = unaccent(theString);
        System.out.println("norm2 ="+ norm2String);
        String norm3String = stripAccents(theString);
        System.out.println("norm3 ="+ norm3String);

//        String midString = theString;
//        midString = midString.replaceAll("ñ","n");
//        midString = midString.replaceAll("ö","o");
//        midString = midString.replaceAll("ø","o");
//        System.out.println("mid ="+ theString);

//        String after2 = theString.replaceAll("[^\\w\\s\\-\\']",""); //this just removes all non (a-z A-Z ' -)
//        System.out.println("after2="+ after2);
    }
    public static List getListOfStrings (){
        List listOfStrings = new ArrayList();
        listOfStrings.add( "Eduardo Peña");
        listOfStrings.add( "Eduard Schröder");
        listOfStrings.add("Edvard Bjørnsen");
        listOfStrings.add("Ed O'neil");
        listOfStrings.add("Edwina Sham-Rock");
        listOfStrings.add("abcGD-$@#%O'ma-jone%yYIUH^%$*&^oiKJg)");
        listOfStrings.add("È,É,Ê,Ë,Û,Ù,Ï,Î,À,Â,Ô,è,é,ê,ë,û,ù,ï,î,à,â,ô,Ç,ç,Ã,ã,Õ,õ");
        listOfStrings.add("çÇáéíóúýÁÉÍÓÚÝàèìòùÀÈÌÒÙãõñäëïöüÿÄËÏÖÜÃÕÑâêîôûÂÊÎÔÛŁØ");
        listOfStrings.add("Gisele Bündchen da Conceição e Silva foi batizada assim em homenagem à sua conterrânea de Horizontina, RS.");
        listOfStrings.add("/Users/rponte/arquivos-portalfcm/Eletron/Atualização_Diária-1.23.40.exe");
        listOfStrings.add("Ł Tĥïŝ ĩš â fůňķŷ Šťŕĭńġ Ø ø");
        return listOfStrings;
    }

    public static String unaccent(String src) {
            return src == null ? null :
                Normalizer.normalize(src, Normalizer.Form.NFD)
                    .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    public static String stripAccents(final String input) {
        if (input == null) {
            return null;
        }
        final StringBuilder decomposed = new StringBuilder(Normalizer.normalize(input, Normalizer.Form.NFD));
        for (int i = 0; i < decomposed.length(); i++) {
            if (decomposed.charAt(i) == '\u0141') {
                decomposed.setCharAt(i, 'L');
            } else if (decomposed.charAt(i) == '\u0142') {
                decomposed.setCharAt(i, 'l');
            }else if (decomposed.charAt(i) == '\u00D8') {
                decomposed.setCharAt(i, 'O');
            }else if (decomposed.charAt(i) == '\u00F8') {
                decomposed.setCharAt(i, 'o');
            }
        }
        // Note that this doesn't correctly remove ligatures...
        return Pattern.compile("\\p{InCombiningDiacriticalMarks}+").matcher(decomposed).replaceAll("");
    }
}