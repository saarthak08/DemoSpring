package com.sg.SpringDemo.ConfigurationWithJavaAnnotationsOnly;

import com.sg.SpringDemo.Coach;
import com.sg.SpringDemo.FortuneService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;



    public SwimCoach(@Qualifier("sadFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice back stroke daily for 30 minutes.";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

}
