package com.sathish83.interviewpreparation.DateTime;


import java.time.Instant;
import java.util.Date;

public class DateFormats {

    public static void main(String[] args) {

     getTodayData();
    }

    private static void getTodayData() {

        Date date = Date.from((Instant.now().plusSeconds(120)));
        System.out.println(date);

    }
}
