package org.example.bridge;

import org.example.bridge.Pens.GreenPen;
import org.example.bridge.Pens.RedPen;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape greenCircle = new Circle(5,5,10,new GreenPen());
        greenCircle.draw();

        Shape redCircle = new Circle(7,12,5,new RedPen());
        redCircle.draw();

    }

}
