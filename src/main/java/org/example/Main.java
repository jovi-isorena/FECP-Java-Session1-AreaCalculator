package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selection;
        double area;
        System.out.println("=== Area Calculator ====");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape (1-3): ");
        String input = sc.nextLine();
        try{
            selection = Integer.parseInt(input);
            if(selection == 1){
                System.out.print("Enter radius: ");
                input = sc.nextLine();
                double radius = Double.parseDouble(input);
                area = calculateCircleArea(radius);
                System.out.printf("Area of the circle: %.2f", area);
            }else if(selection == 2){
                System.out.print("Enter the base: ");
                input = sc.nextLine();
                double base = Double.parseDouble(input);
                System.out.print("Enter the height: ");
                input = sc.nextLine();
                double height = Double.parseDouble(input);
                area = calculateTriangleArea(base, height);
                System.out.printf("Area of the triangle: %.2f", area);
            }else if(selection == 3){
                System.out.print("Enter the length: ");
                input = sc.nextLine();
                double length = Double.parseDouble(input);
                System.out.print("Enter the width: ");
                input = sc.nextLine();
                double width = Double.parseDouble(input);
                area = calculateRectangleArea(length, width);
                System.out.printf("Area of the rectangle: %.2f", area);
            }
        }catch(NumberFormatException e){

        }

    }
    public static double calculateCircleArea(double radius){
        return radius * radius * Math.PI;
    }
    public static double calculateTriangleArea(double base, double height){
        return base * height / 2;
    }
    public static double calculateRectangleArea(double length, double width){
        return length * width;
    }

}