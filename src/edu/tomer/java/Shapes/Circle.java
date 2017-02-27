package edu.tomer.java.shapes;

/**
 * Created by hackeru on 27/02/2017.
 */
public class Circle extends Shape {
    //properties:
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
}
