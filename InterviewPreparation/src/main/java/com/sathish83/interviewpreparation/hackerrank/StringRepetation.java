package com.sathish83.interviewpreparation.hackerrank;

import java.util.Scanner;

/*
     Input -> abc and n = 10 make string as length n(abcabcabca) and find the repetative word find a = ans is 4
 */
public class StringRepetation {

    private static void findRepetitive(String givenInput, int repeatDataUntil, Character c) {

        int length = givenInput.length();
        long q = 0, r = 0;
        q = repeatDataUntil / length; // quotient
        r = repeatDataUntil % length; // remainder
        q = (q==0) ? 1 : q;
        long remaingPartialLength = (r==0) ? 0 : r;
        long count = q * getLetterCount(givenInput, length,c ) + getLetterCount(givenInput, remaingPartialLength, c);
        System.out.println("find the count of charceter is "+ count);
    }

    private static long getLetterCount(String givenInput, long length, Character c) {

        long count = 0;
        for (int i = 0; i < length; i++) {
            if (givenInput.charAt(i) == c) {
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args) {

        System.out.println("Find the string which u find");
        String givenInput = new Scanner(System.in).next();
        System.out.println("Length of repetitive");
        int repeatDataUntil = new Scanner(System.in).nextInt();
        System.out.println("Enter character to find repetitive");
        Character c = new Scanner(System.in).next().charAt(0);
        findRepetitive(givenInput,repeatDataUntil,c);
    }


}
