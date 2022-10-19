package package1;

import java.util.Scanner;

public class BinaryIntoDacimal {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a binary number:");
            int n = s.nextInt();
            if (n<0){
                System.out.println("invalid input");
                System.exit(n);
            }
            int decimal = 0, p = 0;
            while (n != 0) {
                decimal += ((n % 10) * Math.pow(2, p));
                n = n / 10;
                p++;
            }
            System.out.println(decimal);
        } catch (Exception e) {
            System.out.println("invalid number");
        }
    }
}