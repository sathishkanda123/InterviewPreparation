package com.sathish83.interviewpreparation.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteListTest {

    public static void main(String[] args) {

        List<Integer> listValues = new ArrayList<>();
        listValues.add(1);
        listValues.add(10);
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>(listValues);
        copyOnWriteArrayList.forEach(data->{
            listValues.add(data);
        });
        listValues.forEach(System.out::println);
    }
}
