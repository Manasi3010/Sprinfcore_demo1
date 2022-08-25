package com.code.spring;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k ";
    }

    @Override
    public String getDailyFortune() {

        return "Just Do it" + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStart() {
        System.out.println("TrackCoach : isnide method ");
    }

    // add a destroy method
    public void doMyStop() {
        System.out.println("TrackCoach : out of the  method ");
    }
}
