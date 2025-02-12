package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Renderer renderer = new Renderer();

        Shape rect = new Rectangle(10, 5);
        Shape circle = new Circle(7);
        Shape square = new Square(6);

        renderer.render(rect); 
        renderer.render(circle); 
        renderer.render(square);
    }
}

