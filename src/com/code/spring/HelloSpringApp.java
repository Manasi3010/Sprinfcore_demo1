package com.code.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.stereotype.Component;

@Component
public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring java config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // retrieve bean from spring container

        Coach theCoach = context.getBean("wrestlingCoach", Coach.class);

        // call method on the bean
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        // close the context
        context.close();
    }
}
