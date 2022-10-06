package org.example.facade.shapes;


import org.example.facade.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
