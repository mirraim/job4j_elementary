package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    /**
     * Конструктор объекта "треугольник"
     * @param ap - вершина, объект Point
     * @param bp - вершина, объект Point
     * @param cp - вершина, объект Point
     */
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Ищем периметр треугольника
     * @param a = ab
     * @param b = bc
     * @param c = ac
     * @return периметр
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Проверяем, является ли фигура треугольником
     * @param ab - сторона треугольника
     * @param ac - сторона треугольника
     * @param bc - сторона треугольника
     * @return true, если фигура - треугольник, иначе false
     */
    public boolean exist(double ab, double ac, double bc) {
        return (ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac;
    }

    /**
     * Вычисляем площадь, если фигура является треугольником
     * Длину каждой стороны вычисляем с помощью класса Point
     * @return площадь или -1
     */
    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return rsl;
    }
}
