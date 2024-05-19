package com.coverage.test.service;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class CalendarServiceImpl implements CalendarService {

    @Override
    public Mono<String> getBirthday() {
        return Mono.just("Es una prueba");
    }

}
