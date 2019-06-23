package com.sg.SpringDemo.annotations;

import com.sg.SpringDemo.Coach;
import com.sg.SpringDemo.di.FortuneService;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TrackCoach implements Coach {

    public String getDailyWorkout() {
        return "Run 5 rounds of track.";
    }

    public String getDailyFortune() {return null; }
}
