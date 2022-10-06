package org.example.bridge.Pens;

import org.example.bridge.DrawingAPI;

public class RedPen implements DrawingAPI {
    @Override
    public void drawCircle(int x,int y,int radius) {
        System.out.println("Drawing red circle with center (" + x + ";" + y + ") and radius = " + radius);
    }
}
