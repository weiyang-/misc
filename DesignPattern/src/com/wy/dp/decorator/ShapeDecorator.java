
package com.wy.dp.decorator;

public class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {

        this.decoratedShape = decoratedShape;
    }

    public void draw() {

        decoratedShape.draw();
    }
}
