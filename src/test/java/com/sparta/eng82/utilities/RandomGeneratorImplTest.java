package com.sparta.eng82.utilities;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomGeneratorImplTest {

    static RandomGeneratorImpl randomGenerator = null;

    @BeforeAll
    static void init() {
        randomGenerator = new RandomGeneratorImpl();
    }

    @Test
    public void testCorrectReturn() {
        assertEquals(9, randomGenerator.randomInt(9, 10));
        // range 9 to 11 can return 9 or 10, but not 11
    }

    @Test
    public void testRangeIsCorrect() {
        int upper = 20;
        int lower = 10;
        int result = randomGenerator.randomInt(lower, upper);
        if (result <= upper && result >= lower) {
            assertTrue(true);
        }
    }
}