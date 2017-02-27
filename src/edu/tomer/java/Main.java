package edu.tomer.java;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal a = new Cow();
        a.makeSound();


        Animal cow = new Cow(LocalDateTime.of(1996, 7, 5, 0, 0));
        System.out.println(cow.getAge());
    }
}
