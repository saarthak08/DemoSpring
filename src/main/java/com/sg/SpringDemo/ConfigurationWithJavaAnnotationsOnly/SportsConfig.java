package com.sg.SpringDemo.ConfigurationWithJavaAnnotationsOnly;

import com.sg.SpringDemo.Coach;
import com.sg.SpringDemo.FortuneService;
import com.sg.SpringDemo.SadFortuneService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:sports.properties")
//@ComponentScan("com.sg.SpringDemo") /* Component Scanning is used where whole components are scanned. */
public class SportsConfig {
    //define a bean for our sad fortune service


    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    //define bean for our swim coach & inject dependency

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
