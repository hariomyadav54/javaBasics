package task6;

import java.util.Scanner;

public class Validtringle {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ur First Number");
            a = sc.nextDouble();
            System.out.println("Enter ur second Number");
            b = sc.nextDouble();
            System.out.println("Enter ur Third Number");
            c = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Number is invalid");
        }
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("This is Valid tringle");
        } else {
            System.out.println("This is not  valid tringle");
        }
    }
}

