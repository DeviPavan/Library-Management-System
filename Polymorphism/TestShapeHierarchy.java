package Polymorphism;

import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.s;

abstract class Shape {
    double radius;

    abstract double getArea();
    abstract double getPerimeter();
    String color;
    Boolean filled;

    public void setFilled(boolean b) {

    }
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
public class TestShapeHierarchy {
    public static void main(String args[]) {
        double radius;
        Circle c1 = new Circle();
        System.out.println("Radius of the circle="+5);
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Area: " + c1.getArea());
        Rectangle r1=new Rectangle();
        System.out.println("Radius of the Rectangle=");
        r1.radius= s;
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();

        /*Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();*/
    }

    static void displayShapeDetails(Shape[] shapes) {
        System.out.println("Calculating and displaying details for the entered shape:");
        Circle shape = null;
        System.out.println(shape.toString());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println("Welcome to the Shape Hierarchy!");
        System.out.println(" 1.Calculate Area and Perimeter \n" +
                "2. Exit \n");
        while (true) {
            System.out.print("please enter your choice");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the type of shape (circle/rectangle/square):");
                    //shapes[0].radius = Integer.parseInt(s.next());
                    System.out.println("Enter radius");
                   // shapes[0].radius = Integer.parseInt(s.next());
                    //shapes[0].getArea()=s.nextInt();
                    System.out.print("Area");
                   // shapes[0].getPerimeter()=s.nextInt();
                    System.out.print("Perimeter");
                    break;
                case 2:

            }
        }
    }
}




