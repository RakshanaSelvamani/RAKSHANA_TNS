package com.rakshana.assignment;
import java.util.Scanner;

public class Circle {
    private double radius;
    private String colour;

    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        radius = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Enter colour of the circle: ");
        colour = scanner.nextLine();
    }

    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("\n--- Circle Details ---");
        System.out.println("Radius : " + radius);
        System.out.println("Colour : " + colour);
        System.out.println("Area   : " + area);
    }
}
