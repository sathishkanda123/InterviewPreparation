package com.sathish83.interviewpreparation.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FlatMapExamples {

    public static void main(String[] args) {
        Flux.range(1, 300)
                .log()
                .flatMap(a -> Mono.just(a), 10)
                .log()
                .subscribe();
    }
}
