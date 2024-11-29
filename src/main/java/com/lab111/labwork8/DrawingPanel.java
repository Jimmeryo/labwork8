package com.lab111.labwork8;

import com.lab111.labwork8.model.GraphicElement;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanel extends JPanel {
    private List<GraphicElement> elements = new ArrayList<>();

    public void addElement(GraphicElement element) {
        elements.add(element);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);

        for (GraphicElement element : elements) {
            element.draw(g2d);
        }
    }
}