package com.lab111.labwork8.prototype;

import com.lab111.labwork8.model.GraphicElement;

/**
 * Інтерфейс для реалізації клонування графічних елементів
 */
public interface Cloneable {
    /**
     * Метод для поверхневого клонування об'єкта
     * @return поверхнева копія об'єкта
     */
    GraphicElement shallowCopy();

    /**
     * Метод для глибокого клонування об'єкта
     * @return глибока копія об'єкта
     */
    GraphicElement deepCopy();
}