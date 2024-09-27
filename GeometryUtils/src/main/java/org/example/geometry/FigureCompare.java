package org.example.geometry;

public class FigureCompare {

    public static String compareByArea(double area1, double area2) {
        if (area1 > area2) {
            return "Первая фигура больше по площади.";
        } else if (area1 < area2) {
            return "Вторая фигура больше по площади.";
        } else {
            return "Фигуры равны по площади.";
        }
    }

    public static String compareByPerimeter(double perimeter1, double perimeter2) {
        if (perimeter1 > perimeter2) {
            return "Первая фигура больше по периметру.";
        } else if (perimeter1 < perimeter2) {
            return "Вторая фигура больше по периметру.";
        } else {
            return "Фигуры равны по периметру.";
        }
    }

}
