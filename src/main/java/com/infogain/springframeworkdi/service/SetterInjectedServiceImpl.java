package com.infogain.springframeworkdi.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World-Setter";
    }
}
