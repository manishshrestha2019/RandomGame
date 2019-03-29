package com.example.randomgame;

import java.util.Random;

public class NumRandom {

    int minRange=1;
    int maxRange=100;


    Random rand=new Random();

    public int getValue(){
        int value = rand.nextInt(maxRange - minRange) + minRange;
        return value;

    }
    public int getValue1(){
        int value1 = rand.nextInt(maxRange - minRange) + minRange;
        return value1;

    }

}
