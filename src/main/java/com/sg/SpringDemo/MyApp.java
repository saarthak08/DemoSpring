package com.sg.SpringDemo;

import com.sg.SpringDemo.BeanScopeLifeCycleViaXML.TrackCoach;

public class MyApp {
    public static void main(String[] args){
        Coach theCoach=new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());
    }
}
