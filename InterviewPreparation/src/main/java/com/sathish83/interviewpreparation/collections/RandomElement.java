package com.sathish83.interviewpreparation.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomElement {
    public static void main(String[] args) {
        List randomElements = new ArrayList<>();
        randomElements.add(2);
        randomElements.add(3);
        randomElements.add(4);
        Random rand = new Random();
        for (;;){
            int randomPickElement = (int) randomElements.get(rand.nextInt(randomElements.size()));
            System.out.println(randomPickElement);
        }
    }
}
