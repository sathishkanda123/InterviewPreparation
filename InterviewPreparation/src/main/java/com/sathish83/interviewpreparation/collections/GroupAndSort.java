package com.sathish83.interviewpreparation.collections;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class GroupAndSort {

    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    static List<PriceUpdate> priceUpdates;

   static {
         priceUpdates = new ArrayList<>();
         for(int i = 1 ; i <=5;i++) {
             PriceUpdate priceUpdate = new PriceUpdate();
             priceUpdate.setStoreId("Store" + i);
             priceUpdate.setEffectiveDateTime(LocalDateTime.now());
             priceUpdates.add(priceUpdate);
         }

       for(int i = 5 ; i >=1;i--) {
           PriceUpdate priceUpdate = new PriceUpdate();
           priceUpdate.setStoreId("Store" + i);
           priceUpdate.setEffectiveDateTime(LocalDateTime.now());
           priceUpdates.add(priceUpdate);
       }
    }

    static void groupingOnly() {

        Map<String,List<PriceUpdate>> priceGrouping = priceUpdates.parallelStream().
                collect(Collectors.groupingBy(PriceUpdate::getStoreId));
        System.out.println(priceGrouping);

    }

    static void groupingAndSorting() {

        List<PriceUpdate> sortPriceUpdates = priceUpdates.parallelStream().
                sorted(Comparator.comparing(PriceUpdate::getStoreId).
                        thenComparing(PriceUpdate::getEffectiveDateTime)).collect(Collectors.toList());

        Map<String,List<PriceUpdate>> finalLimtData =  sortPriceUpdates.stream().collect(Collectors.groupingBy(PriceUpdate::getStoreId,
                Collectors.collectingAndThen(Collectors.toList(), data-> data.stream().limit(1).collect(Collectors.toList()))));

        System.out.println(finalLimtData);

    }

    public static void main(String[] args) {
       groupingOnly();
       groupingAndSorting();
    }

}
