package com.sathish83.interviewpreparation.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapCustom {

    private int id;

    private String name;

    @Override
    public int hashCode() {
        return 10;
    }

    @Override
    public boolean equals(Object obj) {
        HashMapCustom geek = (HashMapCustom) obj;
        return (geek.id == (this.id));
    }

    public static void main(String[] args) {
        checkMapCreation();
    }

    private static void checkMapCreation() {

        Map<HashMapCustom,HashMapCustom> hashObj = new HashMap();
        HashMapCustom hashMapCustom1 = new HashMapCustom();
        hashMapCustom1.id = 20;
        hashMapCustom1.name = "sathish";
        hashObj.put(hashMapCustom1 ,hashMapCustom1);


        
        HashMapCustom hashMapCustom2 = new HashMapCustom();
        hashMapCustom2.id = 20;
        hashMapCustom2.name = "sathish2";
        hashObj.put(hashMapCustom2 ,hashMapCustom2);
        System.out.println( "size of map is"+hashObj.size());
        hashObj.forEach((key,value)->{
            System.out.println(key.id);
            System.out.println(key.name);
        });
    }



}
