

import assignment4_shapes.*;
import assignment5_vehicles.*;
import assignment6_employees.*;

import java.util.Scanner;

public class mainAssignment {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Assignment 4 (Shapes)");
            System.out.println("2. Assignment 5 (Vehicles)");
            System.out.println("3. Assignment 6 (Employees)");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = readInt();

            switch (choice) {
                case 1 -> shapesMenu();
                case 2 -> vehiclesMenu();
                case 3 -> employeesMenu();
                case 0 -> {
                    System.out.println("Exiting... Bye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void shapesMenu() {
        while (true) {
            System.out.println("\n--- Shapes Menu ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("0. Back");
            System.out.print("Choose: ");

            int choice = readInt();

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter radius: ");
                        double r = readDouble();
                        Shape c = new Circle(r);
                        printShape(c);
                    }
                    case 2 -> {
                        System.out.print("Enter length: ");
                        double l = readDouble();
                        System.out.print("Enter width: ");
                        double w = readDouble();
                        Shape rect = new Rectangle(l, w);
                        printShape(rect);
                    }
                    case 3 -> {
                        System.out.print("Enter side1: ");
                        double a = readDouble();
                        System.out.print("Enter side2: ");
                        double b = readDouble();
                        System.out.print("Enter side3: ");
                        double c = readDouble();
                        Shape tri = new Triangle(a, b, c);
                        printShape(tri);
                    }
                    case 0 -> { return; }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void printShape(Shape shape) {
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
    }

    private static void vehiclesMenu() {
        while (true) {
            System.out.println("\n--- Vehicles Menu ---");
            System.out.println("1. Vehicle");
            System.out.println("2. Car");
            System.out.println("3. Bike");
            System.out.println("0. Back");
            System.out.print("Choose: ");

            int choice = readInt();

            switch (choice) {
                case 1 -> new Vehicle().start();
                case 2 -> new Car().start();
                case 3 -> new Bike().start();
                case 0 -> { return; }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void employeesMenu() {
        while (true) {
            System.out.println("\n--- Employees Menu ---");
            System.out.println("1. Salaried Employee (Monthly Pay)");
            System.out.println("2. Contract Employee (Total Pay)");
            System.out.println("0. Back");
            System.out.print("Choose: ");

            int choice = readInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter annual salary: ");
                    double annual = readDouble();
                    Payable emp = new SalariedEmployee(annual);
                    System.out.println("Monthly Pay: " + emp.calculatePay());
                }
                case 2 -> {
                    System.out.print("Enter hourly rate: ");
                    double rate = readDouble();
                    System.out.print("Enter hours worked: ");
                    double hours = readDouble();
                    Payable emp = new ContractEmployee(rate, hours);
                    System.out.println("Total Pay: " + emp.calculatePay());
                }
                case 0 -> { return; }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static int readInt() {
        while (!sc.hasNextInt()) {
            System.out.print("Enter a valid integer: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private static double readDouble() {
        while (!sc.hasNextDouble()) {
            System.out.print("Enter a valid number: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}
