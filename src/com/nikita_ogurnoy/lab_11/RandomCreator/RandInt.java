package com.nikita_ogurnoy.lab_11.RandomCreator;

import java.util.Random;

public class RandInt {

    int min;
    int max;
    Random r = new Random();

    public RandInt(int min, int max){
        this.min = min;
        this.max = max;
    }

    Integer nextInt(){
        return r.nextInt()%(max-min+1) + min;
    }
}
