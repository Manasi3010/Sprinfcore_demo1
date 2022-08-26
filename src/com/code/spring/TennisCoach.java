package com.code.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    // @Autowired
    // public TennisCoach(FortuneService fortuneService) {
    // this.fortuneService = fortuneService;
    // }

    public TennisCoach() {
        System.out.println(">>>> inside default constructor");
    }

    public TennisCoach(FortuneService fileFortuneService) {
        this.fortuneService = fileFortuneService;
    }

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    @Override
    public String getDailyWorkout() {
        System.out.println(email);
        System.out.println(team);
        return "Practice your bcakhand volley";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }

}
