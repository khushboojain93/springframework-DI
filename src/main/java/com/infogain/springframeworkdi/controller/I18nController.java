package com.infogain.springframeworkdi.controller;

import com.infogain.springframeworkdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    //Used qualifier in this controller because otherwise Primary Bean will be called, if any
    //If no primary bean is available, controller won't know which service to inject in case of multiple implementations of same service
    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
