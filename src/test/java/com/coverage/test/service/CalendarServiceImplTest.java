package com.coverage.test.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import reactor.core.publisher.Mono;

@ExtendWith(MockitoExtension.class)
class CalendarServiceImplTest {

    @Mock
    CalendarServiceImpl service;

    @Test
    @DisplayName("Return OK When Field Is String")
    void returnOkWhenFieldIsString() {
        String value = "Es una prueba";

        TestObserver 
        when(service.getBirthday()).thenReturn(Mono.just(value));
        Assertion(Mono.just(value), service.getBirthday());

    }

}
