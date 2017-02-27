package edu.tomer.java.shapes;

/**
 * Created by hackeru on 27/02/2017.
 */
public class Rectangle extends Shape {
    //properties:
    private double width;
    private double height;

    //constructor
    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height)* 2;
    }
}
