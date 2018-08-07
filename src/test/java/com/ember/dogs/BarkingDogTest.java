package com.ember.dogs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarkingDogTest {

    BarkingDog dog;

    @Before
    public void setUp() throws Exception {
        dog = new BarkingDog();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDogBarkingTooEarly() {
        boolean wakeUp = dog.bark(true, 1);
        assertTrue("Dog's barking too late, time to wake up", wakeUp);
    }

    @Test
    public void testDogIsNotBarkingTooEarly() {
        boolean wakeUp = dog.bark(false, 2);
        assertFalse("Dog is not barking. Keep sleeping", wakeUp);
    }

    @Test
    public void testDogBarksDuringTheDay() {
        boolean wakeUp = dog.bark(true, 8);
        assertFalse("Dog is not barking. No problem", wakeUp);
    }

    @Test
    public void testInvalidNegativeHour() {
        boolean wakeUp = dog.bark(true, -1);
        assertFalse("Dog is not barking. Not a valid hour", wakeUp);
    }

    @Test
    public void testInvalidPositiveHour() {
        boolean wakeUp = dog.bark(true, 24);
        assertFalse("Dog is not barking. Not a valid hour", wakeUp);
    }

}