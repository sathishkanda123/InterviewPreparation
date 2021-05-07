package com.sathish83.interviewpreparation.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Counting {

    public static void main(String[] args) {
        List<Integer> listOfValues = new ArrayList<>();
        listOfValues.add(2);
        listOfValues.add(4);
        listOfValues.add(6);
        listOfValues.add(6);
        listOfValues.add(9);
        Map<Integer, Long> countValue= new HashMap();
//        listOfValues.forEach(e->countValue.merge(e,1L,Long::sum));
//        countValue.forEach((k,v)->{
//            System.out.println(k+""+v);
//        });

        countValue = listOfValues.stream().collect(Collectors.toMap(Function.identity(),v->1L, Long::sum));
        countValue.forEach((k,v)->{
           System.out.println(k+""+v);
        });
    }
}
