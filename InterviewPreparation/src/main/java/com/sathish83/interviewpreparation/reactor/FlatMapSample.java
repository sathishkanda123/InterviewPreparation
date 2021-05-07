package com.sathish83.interviewpreparation.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.Arrays;

public class FlatMapSample {

    static void testFlatMap(){
        Flux<Integer> f = Flux.fromIterable(Arrays.asList(1,2,3,4,5,6));
        f.flatMap(a-> Mono.just(a).subscribeOn(Schedulers.parallel()))
                .doOnNext(a-> System.out.println(  "Received: " + a + " on thread: " + Thread.currentThread().getName()))
                .flatMap( a -> {
                    System.out.println(
                            "Received in flatMap: " + a + " on thread: " + Thread.currentThread().getName());
                    a++;
                    return Mono.just(a).subscribeOn(Schedulers.elastic());
                }).subscribe(  a ->
                System.out.println(
                        "Received (in the subscriber): "
                                + a
                                + " on thread: "
                                + Thread.currentThread().getName()));
        try {
            System.out.println("Inside try block");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    public static void main(String[] args) {
        testFlatMap();
    }

}
