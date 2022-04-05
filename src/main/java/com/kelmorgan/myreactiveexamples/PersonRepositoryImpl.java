package com.kelmorgan.myreactiveexamples;

import com.kelmorgan.myreactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonRepositoryImpl implements PersonRepository {

    Person kufre = new Person(1,"Kufre", "Godwin");
    Person sam = new Person(1,"Sam", "Godwin");
    Person jesse = new Person(1,"Jesse", "Godwin");
    Person fiona = new Person(1,"Fiona", "Godwin");


    @Override
    public Mono<Person> getById(Integer id) {
        return Mono.just(kufre);
    }

    @Override
    public Flux<Person> findAll() {
        return Flux.just(sam,kufre,jesse,fiona);
    }
}
