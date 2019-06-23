package com.sg.SpringDemo.AnnotationsWithXMLConfiguration;

import com.sg.SpringDemo.Coach;
import com.sg.SpringDemo.AnnotationsWithXMLConfiguration.di.TennisCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args){
        //read the config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext-annotations.xml");

        //get the bean from spring container
        Coach coach=context.getBean("thatSillyCoach",Coach.class);

        TennisCoach theCoach=context.getBean("tennisCoach",TennisCoach.class);
        //call a method on the bean
        System.out.println(coach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());
        boolean result=(coach==theCoach);

        System.out.println("Memory Location for theCoach: "+theCoach);
        System.out.println("Memory Location for Coach: "+coach);
        //close the context
        context.close();
    }
}
