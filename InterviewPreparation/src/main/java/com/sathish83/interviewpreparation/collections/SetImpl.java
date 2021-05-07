package com.sathish83.interviewpreparation.collections;

import java.util.HashSet;
import java.util.Set;

public class SetImpl {


    public static void main(String[] args) {

        Set setData = new HashSet();
        setData.add(2);
        setData.add(5);
        setData.add(7);
        setData.add(2);
        setData.forEach(data->
        {
            System.out.println(data);
        });


    }

}
