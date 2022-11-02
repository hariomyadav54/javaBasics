package p1;

import java.util.Scanner;

public class Rectangle {
    double length;
    double breadth;

     Rectangle(double l, double b ) {
        length = l;
        breadth = b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a val of length");
        double length =sc.nextInt();
        System.out.println("Enter a val of breadth");
        double breadth = sc.nextInt();
        double sa = (length * breadth );
        System.out.println("Area of Rectangle = " + sa);

    }
}
