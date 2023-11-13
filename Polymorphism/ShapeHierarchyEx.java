package Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    // Additional methods, getters, and setters if needed
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }
}

class Square extends Rectangle {
    public Square(String color, boolean filled, double sideLength) {
        super(color, filled, sideLength, sideLength);
    }
}

public class ShapeHierarchyEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Shape> shapes = new ArrayList<>();

        int choice;
        do {
            System.out.println("1. Calculate Area and Perimeter");
            System.out.println("2. Exit");
            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAndCalculateShape(scanner, shapes);
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        } while (choice != 2);

        scanner.close();
    }

    private static void createAndCalculateShape(Scanner scanner, ArrayList<Shape> shapes) {
        System.out.print("Enter the type of shape (circle/rectangle/square): ");
        String shapeType = scanner.next();

        System.out.print("Enter color: ");
        String color = scanner.next();

        System.out.print("Is it filled? (true/false): ");
        boolean filled = scanner.nextBoolean();

        switch (shapeType.toLowerCase()) {
            case "circle":
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                shapes.add(new Circle(color, filled, radius));
                break;
            case "rectangle":
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                shapes.add(new Rectangle(color, filled, length, width));
                break;
            case "square":
                System.out.print("Enter side length: ");
                double sideLength = scanner.nextDouble();
                shapes.add(new Square(color, filled, sideLength));
                break;
            default:
                System.out.println("Invalid shape type.");
        }

        // Display area and perimeter
        Shape latestShape = shapes.get(shapes.size() - 1);
        System.out.println("\nArea: " + latestShape.getArea());
        System.out.println("Perimeter: " + latestShape.getPerimeter() +"\n");
    }
}