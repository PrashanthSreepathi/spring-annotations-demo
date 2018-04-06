package com.prashanth.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is mother of good luck",
            "The journey is the reward"
    };

    private Random random = new Random();
    private int index= random.nextInt(data.length);
    @Override
    public String getFortune() {
        return data[index];
    }
}
