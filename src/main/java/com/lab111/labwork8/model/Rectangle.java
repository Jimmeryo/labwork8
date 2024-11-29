package com.lab111.labwork8.model;

import java.awt.*;

public class Rectangle extends GraphicElement {
    private int width;
    private int height;

    public Rectangle(MyPoint position, String color, int width, int height) {
        super(position, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.decode(color));
        g2d.drawRect(position.getX(), position.getY(), width, height);
    }

    @Override
    public GraphicElement shallowCopy() {
        System.out.println("Створення поверхневої копії прямокутника");
        return new Rectangle(this.position, this.color, this.width, this.height);
    }

    @Override
    public GraphicElement deepCopy() {
        System.out.println("Створення глибокої копії прямокутника");
        return new Rectangle(new MyPoint(this.position), this.color, this.width, this.height);
    }

    // Геттери і сеттери залишаються без змін
}