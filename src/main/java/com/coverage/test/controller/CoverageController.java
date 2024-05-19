package com.coverage.test.controller;

import org.springframework.web.bind.annotation.RestController;

import com.coverage.test.service.CalendarServiceImpl;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@RestController
@RequestMapping("calendar")
public class CoverageController {

    CalendarServiceImpl service;

    @GetMapping("/")
    public Mono<String> getBirthday() {
        return service.getBirthday();
    }

}
