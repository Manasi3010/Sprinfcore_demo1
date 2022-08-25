package com.code.spring;

public class Football implements Coach {

    private FortuneService fortuneService;

    private Football(FortuneService thefFortuneService) {
        fortuneService = thefFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "have to  goal";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}
