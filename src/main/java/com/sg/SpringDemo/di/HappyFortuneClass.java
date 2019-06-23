package com.sg.SpringDemo.di;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneClass implements FortuneService {

    public String getFortune(){
        return "Today is your lucky day!";
    }
}
