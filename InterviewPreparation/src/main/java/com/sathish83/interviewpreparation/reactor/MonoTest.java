package com.sathish83.interviewpreparation.reactor;

import reactor.core.publisher.Flux;

public class MonoTest {


    public static void main(String[] args) {

        Flux<String> stringData = Flux.just("10");
        stringData.doOnNext(data->{
            if(data.equals("10")){
                System.out.println("equals");
            }
        }).doOnNext(data->{
            System.out.println(data);
        }).subscribe();
    }

}
