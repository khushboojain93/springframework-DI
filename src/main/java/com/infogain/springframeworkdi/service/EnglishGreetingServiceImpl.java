package com.infogain.springframeworkdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//We have marked English as default profile which work if no active profile is mentioned in application.properties
@Profile({"English", "default"})
@Service("i18nService")
public class EnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World- English Greeting";
    }
}
