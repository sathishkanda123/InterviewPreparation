package com.sathish83.interviewpreparation.reactivestreams;

import com.sathish83.interviewpreparation.model.Company;
import com.sathish83.interviewpreparation.model.JobSeeker;
import com.sathish83.interviewpreparation.model.Location;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class MonoTest {

    public void doOnDiscardData() {

        Company company = new Company();
        company.setCompanyName("GE");
        company.setInterviewLocation(new Location("Bangalore"));

        Mono<Company> companyMono = Mono.just(company);
        companyMono.doOnNext(company1 -> {
            System.out.println(company1.getCompanyName());
            Mono<List<String>> seekerMono = Mono.just(Arrays.asList("Hello","Sir","Kush hai"));
        }).doOnDiscard(Company.class, company1 -> {
            System.out.println("do on discard"+ company1.getInterviewLocation().getLocationName());
        }).
    doOnNext(company1 -> {
            System.out.println("do on next"+ company1.getInterviewLocation().getLocationName());
        }).doOnSuccess(company1 -> {
            System.out.println("do on success"+ company1.getInterviewLocation().getLocationName());
        }).subscribe();
    }


    public static void main(String[] args) {
//       Mono<List<String>> monoData = Mono.just(Arrays.asList("Hello","Sir","Kush hai"));
//       monoData.subscribe(data->{
//           List<String> names = monoData.log().block();
//           names.forEach(System.out::println);
//       });

       MonoTest mt = new MonoTest();
       mt.doOnDiscardData();

    }
}
