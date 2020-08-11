package com.infogain.springframeworkdi;

import com.infogain.springframeworkdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringframeworkDiApplication {

	public static void main(String[] args)
    {
		ApplicationContext ctx= SpringApplication.run(SpringframeworkDiApplication.class, args);

        MyController myController=(MyController)ctx.getBean("myController");
        String greeting=myController.sayHello();
        System.out.println(greeting);
	}

}
