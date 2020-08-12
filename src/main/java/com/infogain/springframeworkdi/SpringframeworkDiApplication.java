package com.infogain.springframeworkdi;

import com.infogain.springframeworkdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringframeworkDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringframeworkDiApplication.class, args);

        I18nController i18nController=(I18nController) ctx.getBean("i18nController") ;
        System.out.println("INternationalization controller is calling the profile activated service now");
        System.out.println(i18nController.getGreeting());

		PrimaryController primaryController=(PrimaryController)ctx.getBean("primaryController") ;
		System.out.println("-----------Primary Bean----------");
		System.out.println(primaryController.getGreeting());

		PropertyInjectedController propertyInjectedController=(PropertyInjectedController)ctx.getBean("propertyInjectedController");

		System.out.println("----------Property Based Injection--------");

		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController=(SetterInjectedController)ctx.getBean("setterInjectedController");

		System.out.println("--------------Setter Based Injection-----------");

		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println("------------Constructor Based Injection-----------");

		System.out.println(constructorInjectedController.getGreeting());

	}

}
