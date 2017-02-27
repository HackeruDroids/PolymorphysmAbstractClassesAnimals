package edu.tomer.java.shapes;

/**
 * Created by hackeru on 27/02/2017.
 */
public abstract class Shape {
    //properties
    private String color;
    //constructor:
    protected Shape(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "\nColor=" + color +
                "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }
    //getColor - getter
    public String getColor() {
        return color;
    }
}
