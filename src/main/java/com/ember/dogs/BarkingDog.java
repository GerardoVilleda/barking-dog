package com.ember.dogs;

public class BarkingDog {

    public boolean bark(boolean barking, int hourOfDay) {
        // Invalid hour
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        // Dog's not barking
        if (!barking) {
            return false;
        }

        // If we reached here the dog is barking, check the hours
        if (hourOfDay < 8 || hourOfDay > 22) {
            return true;
        }
        else {
            return false;
        }
    }
}
