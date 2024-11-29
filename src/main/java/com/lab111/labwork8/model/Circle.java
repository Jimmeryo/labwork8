package com.lab111.labwork8.model;

import java.awt.*;

public class Circle extends GraphicElement {
    private int radius;

    public Circle(MyPoint position, String color, int radius) {
        super(position, color);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.decode(color));
        g2d.drawOval(position.getX() - radius, position.getY() - radius,
                     radius * 2, radius * 2);
    }

    @Override
    public GraphicElement shallowCopy() {
        System.out.println("Створення поверхневої копії кола");
        return new Circle(this.position, this.color, this.radius);
    }

    @Override
    public GraphicElement deepCopy() {
        System.out.println("Створення глибокої копії кола");
        return new Circle(new MyPoint(this.position), this.color, this.radius);
    }

    // Геттери і сеттери залишаються без змін
}