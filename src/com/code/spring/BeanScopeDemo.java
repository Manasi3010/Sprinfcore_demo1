package com.code.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanscopapplicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach theCoach1 = context.getBean("myCoach", Coach.class);
        boolean result = (theCoach == theCoach1);
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location : " + theCoach);
        System.out.println("\nMemory location : " + theCoach1);
        context.close();
    }
}
