package com.lab111.labwork8;

import com.lab111.labwork8.model.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Демонстрація поверхневого клонування
        System.out.println("Демонстрація поверхневого клонування:");
        MyPoint point1 = new MyPoint(100, 50);
        Circle circle = new Circle(point1, "#FF0000", 50);  // Червоний колір
        Rectangle rectangle = new Rectangle(new MyPoint(300, 200), "#0000FF", 100, 80);  // Синій колір

        GraphicElement shallowCircleCopy = circle.shallowCopy();
        GraphicElement shallowRectangleCopy = rectangle.shallowCopy();

        // Зміна оригінального кола
        circle.getPosition().setX(200);

        System.out.println("Оригінальне коло після зміни: " + circle);
        System.out.println("Поверхнева копія кола: " + shallowCircleCopy);

        // Демонстрація глибокого клонування
        System.out.println("\nДемонстрація глибокого клонування:");
        GraphicElement deepCircleCopy = circle.deepCopy();
        GraphicElement deepRectangleCopy = rectangle.deepCopy();

        // Зміна оригінального кола
        circle.getPosition().setX(300);

        System.out.println("Оригінальне коло після зміни: " + circle);
        System.out.println("Глибока копія кола: " + deepCircleCopy);

        // Демонстрація різниці між поверхневим і глибоким клонуванням для прямокутника
        System.out.println("\nДемонстрація різниці клонування для прямокутника:");
        System.out.println("Оригінальний прямокутник: " + rectangle);
        System.out.println("Поверхнева копія прямокутника: " + shallowRectangleCopy);
        System.out.println("Глибока копія прямокутника: " + deepRectangleCopy);

        // Зміна позиції оригінального прямокутника
        rectangle.getPosition().setX(400);
        rectangle.getPosition().setY(300);

        System.out.println("\nПісля зміни оригінального прямокутника:");
        System.out.println("Оригінальний прямокутник: " + rectangle);
        System.out.println("Поверхнева копія прямокутника: " + shallowRectangleCopy);
        System.out.println("Глибока копія прямокутника: " + deepRectangleCopy);

        // Створюємо вікно та панель для малювання
        JFrame frame = new JFrame("Графічний редактор - Прототипи");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);

        DrawingPanel drawingPanel = new DrawingPanel();
        frame.add(drawingPanel);

        // Додаємо елементи на панель
        drawingPanel.addElement(circle);
        drawingPanel.addElement(rectangle);
        drawingPanel.addElement(shallowCircleCopy);
        drawingPanel.addElement(deepCircleCopy);
        drawingPanel.addElement(shallowRectangleCopy);
        drawingPanel.addElement(deepRectangleCopy);

        frame.setVisible(true);
    }
}