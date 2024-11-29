package com.lab111.labwork8.model;

import com.lab111.labwork8.prototype.Cloneable;
import java.awt.Graphics2D;

public abstract class GraphicElement implements Cloneable {
    protected MyPoint position;
    protected String color;

    public GraphicElement(MyPoint position, String color) {
        this.position = position;
        this.color = color;
    }
    public MyPoint getPosition() {
        return position;
    }

    public abstract void draw(Graphics2D g2d);

    public abstract GraphicElement shallowCopy();
    public abstract GraphicElement deepCopy();

    // Геттери і сеттери залишаються без змін
}