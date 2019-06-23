package com.sg.SpringDemo.ConfigurationWithJavaAnnotationsOnly;

import com.sg.SpringDemo.Coach;
import com.sg.SpringDemo.FortuneService;
import com.sg.SpringDemo.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties")
//@ComponentScan("com.sg.SpringDemo")
public class SportsConfig {
    //define a bean for our sad fortune service


    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    //define bean for our swim coach & inject dependency

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
