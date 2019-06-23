package com.sg.SpringDemo.BeanScopeLifeCycleViaXML;


import com.sg.SpringDemo.Coach;
import com.sg.SpringDemo.FortuneService;


public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach(){}

    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    public String getDailyFortune() {
        return "Just Do it"+fortuneService.getFortune();
    }

    //add an init-method
    public void doMyStartupStuff(){
        System.out.println("Inside init method");
    }

    public void doMyCleanupStuff(){
        System.out.println("Inside destroy method");
    }
}
