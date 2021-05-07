package com.sathish83.interviewpreparation.java8;

import java.util.function.Predicate;

public class PredicatesExamples {

    public static void main(String[] args) {
        Predicate<Integer> findIsLesser = i -> (i<18);
        System.out.println(findIsLesser.test(10));
        System.out.println(findIsLesser.negate().test(10));
        predicateData(10,i-> (i<20));
    }

    static void predicateData(int number, Predicate<Integer> predicate){
          if(predicate.test(number)){
              System.out.println("yes"+number);

          }
    }

}
