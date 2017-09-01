package Ch02_Objects_Classes_Interfaces;

import com.sun.org.apache.regexp.internal.RE;
import javafx.scene.shape.Circle;

/**
 * Created by Ross on 01.09.2017.
 */
public class Ex2_1Circle {
    private int centerX, centerY, radius;

    public Ex2_1Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Ex2_1Circle() {
        this.centerX = 0;
        this.centerY = 0;
        this.radius = 0;
    }

    public Ex2_1Circle(int radius) {
        this.centerX = 0;
        this.centerY = 0;
        this.radius = radius;
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public int getRadius() {
        return radius;
    }

    public void move(int deltax, int deltay) {
        centerX += deltax;
        centerY += deltay;
    }

    public void changeRadius(int chanRad) {
        radius += chanRad;
    }

    public boolean isInside(int x, int y) {
        return (centerX - x) * (centerX - x) + (centerY - y) * (centerY - y) <= radius * radius;
    }


    @Override
    public String toString() {
        return "Круг с центром в точке " + centerX + ", " + centerY + ". И радиусом " + radius;
    }

    public Rect boundingBox() {
        return new Rect(centerX - radius, centerX + radius, centerY - radius, centerY + radius);
    }
}


class CircleDemo {
    public static void main(String[] args) {
        Ex2_1Circle circle1 = new Ex2_1Circle(2, 1, 2);
        System.out.println(circle1);
        System.out.println("Проверка точки с координатами с 3, 2");
        if (circle1.isInside(3, 2)) {
            System.out.println("Точка принадлежит окружности");
        } else System.out.println("Точка не принадлежит окружности");
        System.out.println("Проверка точки с координатами с 4, 3");
        if (circle1.isInside(4, 3)) {
            System.out.println("Точка принадлежит окружности");
        } else System.out.println("Точка не принадлежит окружности");

        Rect rect1 = circle1.boundingBox();
        System.out.println(rect1);
    }
}
