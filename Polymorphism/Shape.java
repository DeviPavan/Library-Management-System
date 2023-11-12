package Polymorphism;

abstract class Shape {
   abstract double getArea();
    abstract double getPerimeter();
    String color;
    Boolean filled;
}
class Circle extends Shape{
    float radius;

    @Override
    double getArea() {
        double area = radius * radius * Math.PI;
        System.out.println("The area of the circle [radius = " + radius + "]: " + area);
        return 0;
    }
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape{
    int length;
    int width;

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }
}
class Square extends Shape{
    int sideLengthOfSquare;

    @Override
    double getArea() {
        return sideLengthOfSquare*sideLengthOfSquare;
    }
    @Override
    double getPerimeter() {
        return 4*sideLengthOfSquare;
    }
}
