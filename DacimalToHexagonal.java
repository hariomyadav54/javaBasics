package package1;

import java.util.Scanner;

public class DacimalToHexagonal {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a decimal number : ");
            int num = sc.nextInt();
            if(num < 0) {
                System.out.println("invalid input");
                System.exit(num);
            }
            String str = Integer.toHexString(num);
            System.out.println("Method 1: Decimal to hexadecimal: " + str);
        } catch (Exception e) {
            System.out.println("invalid input");
        }
    }
}
