package edu.tomer.java.zoo;

import java.time.LocalDateTime;

/**
 * Created by hackeru on 27/02/2017.
 */
public class Cow extends Animal {

    //constructor
    public Cow() {
        super();
    }

    public Cow(LocalDateTime birthDate) {
        super(birthDate);
    }

    @Override
    public void makeSound() {
        System.out.println("Moooooo");
    }
}
