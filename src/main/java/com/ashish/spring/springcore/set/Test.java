package com.ashish.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ashish/spring/springcore/set/setconfig.xml");
        CarDealer hospital = (CarDealer)context.getBean("cardealer");
        System.out.println(hospital.getName());
        System.out.println(hospital.getModels());
        System.out.println(hospital.getModels().getClass());
    }
    
}
