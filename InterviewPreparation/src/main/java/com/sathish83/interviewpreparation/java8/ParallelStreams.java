package com.sathish83.interviewpreparation.java8;

import java.util.stream.IntStream;

public class ParallelStreams {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        IntStream s = IntStream.range(0, 20);
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "20");
        s.parallel().forEach(i -> {
            try { Thread.sleep(100); } catch (Exception ignore) {}
            System.out.print((System.currentTimeMillis() - start) + " ");
        });
       strArray("sathihsh");
    }

      static void strArray(String name){

        IntStream.range(0, name.length()).forEach(i -> {

        });

    }

}
