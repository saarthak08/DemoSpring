package com.sg.SpringDemo.annotations;

import com.sg.SpringDemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args){
        //read the config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-annotations.xml");

        //get the bean from spring container
        Coach coach=context.getBean("thatSillyCoach",Coach.class);

        Coach theCoach=context.getBean("tennisCoach",Coach.class);
        //call a method on the bean
        System.out.println(coach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());
        //close the context
        context.close();
    }
}
