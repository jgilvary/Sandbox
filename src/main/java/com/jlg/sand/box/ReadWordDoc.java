package com.jlg.sand.box;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadWordDoc {





    public static void main (String[] args){

        System.out.println("start ReadWordDoc-------------");

        String filePath = "test.docx";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            // Create a new WordExtractor
            //WordExtractor extractor = new WordExtractor(fis);
            // Extract the text
            //String text = extractor.getText();
            //System.out.println(text);

            System.out.println("read");
        } catch (Exception e) {
            e.printStackTrace();
    }

        System.out.println("end ReadWordDoc---------------");
    }
}


