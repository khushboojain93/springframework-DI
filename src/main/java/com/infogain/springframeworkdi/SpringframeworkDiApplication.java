package com.infogain.springframeworkdi;

import com.infogain.springframeworkdi.controller.ConstructorInjectedController;
import com.infogain.springframeworkdi.controller.PropertyInjectedController;
import com.infogain.springframeworkdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringframeworkDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringframeworkDiApplication.class, args);

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
