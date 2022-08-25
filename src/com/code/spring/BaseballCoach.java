package com.code.spring;

public class BaseballCoach implements Coach {
    // define a private feild for the dependency
    private FortuneService fortuneService;

    // define a constructor for depen injection
    public BaseballCoach(FortuneService thefFortuneService) {
        fortuneService = thefFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneservice

        return fortuneService.getFortune();
    }

}
