package com.infogain.springframeworkdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World-Constructor";
    }
}
