package com.prashanth.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach(){
//        System.out.println("This TennisCoach constructor called");
    }
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService theFortuneService){
//        fortuneService = theFortuneService;
//    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void doMystartupStuff(){
        System.out.println("my startup code is executed here");
    }
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("my cleanup stuff is done here");
    }
}
