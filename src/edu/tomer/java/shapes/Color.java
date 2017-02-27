package edu.tomer.java.shapes;

//From main Or from Shape
//Color c = Color.BLACK;
public enum Color {

    BLACK(0), WHITE(1), ORANGE(2), BLUE(3), GREEN(4);

    private final int value;

    Color(int value) {
        this.value = value;
    }

    public static Color getColor(int value){
        for (Color c : values()) {
            if (c.value == value)
                return c;
        }
        return null;
    }

    @Override
    public String toString() {
        switch (this){
            case BLACK:
                //String name = this.name().toLowerCase();
                return "Black";
            case WHITE:
                return "White";
            case ORANGE:
                return "Orange";
            case BLUE:
                return  "Blue";
            case GREEN:
                return "Green";
            default:
                return null;
        }
    }
}
