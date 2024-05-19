package com.coverage.test.service;

import reactor.core.publisher.Mono;

public interface CalendarService {

    Mono<String> getBirthday();

}
