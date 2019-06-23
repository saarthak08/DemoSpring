package com.sg.SpringDemo.XMLConfiguration;

import com.sg.SpringDemo.Coach;
import com.sg.SpringDemo.Logger.MyLoggerConfig;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach=context.getBean("myCoach",Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        context.close();
    }
}
