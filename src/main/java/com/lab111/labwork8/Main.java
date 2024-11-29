package com.lab111.labwork8;

import com.lab111.labwork8.model.*;  // залиште цей
import javax.swing.*;
import java.awt.*;  // це залишаємо для інших класів з java.awt

public class Main {
    public static void main(String[] args) {
        // Створюємо вікно
        JFrame frame = new JFrame("Графічний редактор - Прототипи");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
    
        // Створюємо панель для малювання
        DrawingPanel drawingPanel = new DrawingPanel();
        frame.add(drawingPanel);
    
        // Створюємо оригінальні об'єкти
        MyPoint point1 = new MyPoint(100, 100);
        Circle circle = new Circle(point1, "#FF0000", 50);
        com.lab111.labwork8.model.Rectangle rectangle = new com.lab111.labwork8.model.Rectangle(new MyPoint(300, 200), "#0000FF", 100, 80);
    
        // Додаємо оригінальні об'єкти
        drawingPanel.addElement(circle);
        drawingPanel.addElement(rectangle);
    
        // Створюємо та додаємо копії
        GraphicElement circleCopy = circle.deepCopy();
        ((MyPoint)circleCopy.getPosition()).setX(400);
        ((MyPoint)circleCopy.getPosition()).setY(300);
        drawingPanel.addElement(circleCopy);
    
        GraphicElement rectangleCopy = rectangle.deepCopy();
        ((MyPoint)rectangleCopy.getPosition()).setX(500);
        ((MyPoint)rectangleCopy.getPosition()).setY(400);
        drawingPanel.addElement(rectangleCopy);
    
        // Показуємо вікно
        frame.setVisible(true);
    }
}