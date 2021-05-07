package com.sathish83.interviewpreparation.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListIndex {

    public static void main(String[] args) {

        List lists = new ArrayList();
        lists.add(3);
        lists.add(2);
        lists.add(3);
        Map<Boolean,List<Integer>> groupingelements =
                (Map<Boolean, List<Integer>>) lists.stream().collect(Collectors.groupingBy(data-> data.equals(3)));
        groupingelements.forEach((key,value)->{
            System.out.println(key+""+value);
        });


    }
}
