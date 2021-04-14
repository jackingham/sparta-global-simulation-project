package com.sparta.eng82.utilities;

import java.util.Random;

public class RandomGeneratorImpl implements RandomGenerator {
    @Override
    public int randomInt(int lower, int upper) {
        Random random = new Random();
        return random.nextInt(upper - lower) + lower;
    }
}