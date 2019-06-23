package com.sg.SpringDemo.annotations.di;

import com.sg.SpringDemo.Coach;
import com.sg.SpringDemo.di.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier("happyFortuneClass") FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
