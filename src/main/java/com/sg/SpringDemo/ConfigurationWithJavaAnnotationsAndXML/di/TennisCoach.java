package com.sg.SpringDemo.ConfigurationWithJavaAnnotationsAndXML.di;

import com.sg.SpringDemo.Coach;
import com.sg.SpringDemo.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

    //Field Injection
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;
/*  This is Constructor Injection
    @Autowired
    public TennisCoach(@Qualifier("happyFortuneClass") FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
*/

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    //Define a constructor
    public TennisCoach(){
        System.out.println("Tennis Coach >> Inside the default no-arg constructor.");
    }


    //Define a setter method **Setter Injection**
    @Autowired
    public void setFortuneService(@Qualifier("happyFortuneService") FortuneService fortuneService){
        System.out.println("Tennis Coach >> Inside the setter setFortuneService method.");
        this.fortuneService=fortuneService;
    }

    /* Method/Setter Injection */
    @Autowired
    public void doSomeCrazyStuff(@Qualifier("happyFortuneService") FortuneService fortuneService){
        System.out.println("Tennis Coach >> Inside the doSomeCrazyStuff method.");
        this.fortuneService=fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("Inside init method");
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("Inside destroy method");
    }
}
