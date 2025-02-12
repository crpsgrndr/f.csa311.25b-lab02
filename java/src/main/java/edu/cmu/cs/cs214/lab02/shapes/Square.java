package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public int getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with side " + side + " (Area: " + getArea() + ")");
    }
}
