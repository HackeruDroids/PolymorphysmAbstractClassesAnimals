package edu.tomer.java;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 */
public abstract class Animal {
    private LocalDateTime birthDate;
    //don't know what the sound will be -> but all animals make sound!
    //constructor:
    public Animal() {
        birthDate = LocalDateTime.now();
    }
    //constructor:
    public Animal(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }
    public abstract void makeSound();
    public int getAge(){
        LocalDateTime now = LocalDateTime.now();
        //dif between birthdate and now
        return (int) birthDate.until(now, ChronoUnit.MINUTES);
    }
}
