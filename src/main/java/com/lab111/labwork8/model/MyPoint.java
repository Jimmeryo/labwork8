package com.lab111.labwork8.model;

/**
 * Клас, що представляє точку на площині
 */
public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Конструктор копіювання для глибокого клонування
    public MyPoint(MyPoint myPoint) {
        this.x = myPoint.x;
        this.y = myPoint.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}