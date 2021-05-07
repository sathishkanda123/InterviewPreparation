package com.sathish83.interviewpreparation;

public class StringFormatter {


    public static void main(String[] args) {

        String digit = "%05d";


        System.out.println(String.format(digit, 0));
        System.out.println(String.format(digit, 1));
        System.out.println(String.format(digit, 2));

        System.out.println(String.format(digit, 10));
        System.out.println(String.format(digit, 11));
        System.out.println(String.format(digit, 60));

    }

}
