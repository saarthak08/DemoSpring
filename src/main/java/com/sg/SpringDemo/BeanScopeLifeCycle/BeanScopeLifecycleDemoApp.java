package com.sg.SpringDemo.BeanScopeLifeCycle;

import com.sg.SpringDemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeLifecycleDemoApp {
    public static void main(String[] args){

        //Load the Spring Configuration File
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-beanScopeLifecycle.xml");

        //retrieve bean from Spring Container
        Coach theCoach=context.getBean("myCoach",Coach.class);
        Coach alphaCoach=context.getBean("myCoach",Coach.class);

        boolean result=(alphaCoach==theCoach);

        System.out.println("Memory Location for theCoach: "+theCoach);
        System.out.println("Memory Location for alphaCoach: "+alphaCoach);

        //close the Context
        context.close();

    }
}
