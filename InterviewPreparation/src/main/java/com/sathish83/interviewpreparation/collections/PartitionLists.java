package com.sathish83.interviewpreparation.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionLists {

    public static void main(String[] args) {

        List<Integer> listOfValues = new ArrayList(Arrays.asList(2,7,8,1));
        Map<Boolean,List<Integer>> partionValues = listOfValues.stream().collect(Collectors.partitioningBy(data-> (data/7)==0));
        List<List<Integer>> subSets = new ArrayList<List<Integer>>(partionValues.values());
        subSets.get(0).forEach(System.out::println);
        subSets.get(1).forEach(System.out::println);
    }
}
