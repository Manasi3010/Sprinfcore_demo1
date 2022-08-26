package com.code.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties.txt")
@ComponentScan("com.code.spring")
public class SportConfig {

    // define bean for our happy fortune service
    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach wrestlingCoach() {
        WrestlingCoach myWrestlingCoach = new WrestlingCoach(happyFortuneService());

        return myWrestlingCoach;
    }

}