package com.sathish83.interviewpreparation.reactivestreams;

import reactor.core.publisher.Flux;

import java.util.concurrent.atomic.AtomicInteger;

public class FluxTest {



    private void explainDoOnDiscard() {
        AtomicInteger discardNumberCount = new AtomicInteger();
        AtomicInteger discardStringCount = new AtomicInteger();
        Flux<Integer> fluxData = Flux.just(1,2,3,4,5,6,20,33);
        Flux<String> finalData =  fluxData.filter(i-> i%2 ==0)
                 .map(String::valueOf)
                 .filter(s->s.length()<2)
                 .doOnDiscard(Number.class, i-> discardNumberCount.incrementAndGet())
                 .doOnDiscard(String.class, i-> discardStringCount.incrementAndGet());
         finalData.subscribe(System.out::println);
         System.out.println("Number count");
         System.out.println(discardNumberCount);
         System.out.println("String count");
         System.out.println(discardStringCount);
    }




    
    public static void main(String[] args)
    {
       FluxTest fluxTest = new FluxTest();
       fluxTest.explainDoOnDiscard();
    }

}
