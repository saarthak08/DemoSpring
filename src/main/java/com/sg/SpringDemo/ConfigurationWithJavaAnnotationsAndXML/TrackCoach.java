package com.sg.SpringDemo.ConfigurationWithJavaAnnotationsAndXML;

import com.sg.SpringDemo.Coach;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TrackCoach implements Coach {

    public String getDailyWorkout() {
        return "Run 5 rounds of track.";
    }

    public String getDailyFortune() {return null; }
}
