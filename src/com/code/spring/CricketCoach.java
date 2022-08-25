package com.code.spring;

public class CricketCoach implements Coach {

    private String emailAdd;
    private String team;
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {

        return fortuneService.getFortune();
    }

    // create setter method for di
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter Method");
        this.fortuneService = fortuneService;
    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public void setEmailAdd(String emailAdd) {
        System.out.println("EmailAddress");
        this.emailAdd = emailAdd;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("team");
        this.team = team;
    }

}
