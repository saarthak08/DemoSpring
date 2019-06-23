package com.sg.SpringDemo.XMLConfiguration.di;

import com.sg.SpringDemo.Coach;
import com.sg.SpringDemo.FortuneService;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public String getDailyWorkout() {
        return "Practice batting for 2 hours";
    }

    public CricketCoach(){
        System.out.println("Cricket Coach: No-arg constructor called.");
    }
    public String getDailyFortune() {
        return "Hello " +fortuneService.getFortune();
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket Coach: inside setter method -setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket Coach: inside setter method -setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Cricket Coach: inside setter method -setTeam");
        this.team = team;
    }
}
