package com.sathish83.interviewpreparation.programs;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class FindRepeatedChars {

    public static void main(String[] args) {

        System.out.println("Enter the string value to repeat");
        String input = new Scanner(System.in).next();
        AtomicReference<String> s = new AtomicReference<>("");
        input.chars().forEach(c->{
            s.updateAndGet(v -> v + (char)c);
        });
        System.out.println(s.get());
    }
}
