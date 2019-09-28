package com.sg.SpringDemo.ConfigurationWithJavaAnnotationsOnly;

import com.sg.SpringDemo.Coach;
import com.sg.SpringDemo.ConfigurationWithJavaAnnotationsAndXML.di.TennisCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args){

        //read the Spring Config Java Class
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);

        //get the bean from spring container

        SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
        //call a method on the bean

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());


        //close the context
        context.close();
    }
}
