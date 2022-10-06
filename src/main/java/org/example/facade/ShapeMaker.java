package org.example.facade;

import org.example.facade.shapes.Circle;
import org.example.facade.shapes.Rectangle;
import org.example.facade.shapes.Square;

public class ShapeMaker {
    private Circle circle;
    private Rectangle rectangle;
    private Square square;
    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    public void drawSquare(){
        square.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawCircle(){
        circle.draw();
    }
}
