package package6;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter - \n" + "  1. Square \n" + "  2. Rectangle \n" + "  3. Circle");

            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Enter the Side of the Square - ");
                    float side = sc.nextFloat();
                    System.out.println("Area - " + (side * side) + " unit square");
                    break;
                case 2:
                    System.out.print("Enter Length of the Rectangle - ");
                    float length = sc.nextFloat();
                    System.out.print("Enter Breadth of the Rectangle - ");
                    float breadth = sc.nextFloat();
                    System.out.println("Area - " + (length * breadth) + " unit square");
                    break;
                case 3:
                    System.out.print("Enter the Radius of the Circle - ");
                    float radius = sc.nextFloat();
                    System.out.println("Area - " + (Math.PI * radius * radius) + " unit square");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("ivalid input");
        }
    }
}


