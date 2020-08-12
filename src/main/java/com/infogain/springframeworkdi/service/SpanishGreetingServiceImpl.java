package com.infogain.springframeworkdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Spanish")
@Service("i18nService")
public class SpanishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola MUndo- Spanish Greeting";
    }
}
