package package7;
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        double n = 0;
        try {
            System.out.println("Customer Id:");
            id = Integer.parseInt(sc.next());
            System.out.println("Customer Name:");
            String name = sc.next();

            System.out.println("Unit Consumed:");
            n = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid Input..");
            System.out.println("Enter Valid Input:");
            System.out.println("Customer Id:");
            id = Integer.parseInt(sc.next());
            System.out.println("Customer Name:");
            String name = sc.next();

            System.out.println("Unit Consumed:");
            n = sc.nextDouble();
        }
        double num;
        if (n <= 199) {
            num = n * 1.20;
            if (num >= 100) {
                System.out.println("The Minimum Amount Will be:" + num);
            }
        } else if (n >= 200 && n <= 400) {
            num = n * 1.50;
            if (num > 400) {
                double a = num * 15;
                double extraAmt = a / 100;
                System.out.println("Surged Charged:" + extraAmt);
                num = num + extraAmt;
            }
            System.out.println(" Amount Paid By The Customer: " + num);
        } else if (n > 400 && n <= 600) {
            num = n * 1.80;
            if (num > 400) {
                double a = num * 15;
                double extraAmt = a / 100;
                System.out.println("Surged Charged:" + extraAmt);
                num = num + extraAmt;
            }
            System.out.println(" Amount Paid By The Customer: " + num);
        } else if (n > 600) {
            num = n * 2.00;
            if (num > 400) {
                //System.out.println("Num: " +num);
                double a = num * 15;
                double extraAmt = a / 100;
                System.out.println("Surged Charged:" + extraAmt);
                num = num + extraAmt;
            }
            System.out.println("Net Amount Paid By The Customer: " + num);
        }
    }
}
