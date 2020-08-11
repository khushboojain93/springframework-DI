package com.infogain.springframeworkdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world- Primary Greeting Service that supercedes all other implementation of Greeting Service";
    }
}
