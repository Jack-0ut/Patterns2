package org.example.facade.shapes;

import org.example.facade.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
