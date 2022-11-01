package task1;

import java.util.Scanner;

public class Oddandeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int num=0;
        System.out.println("Check a given Number is even or Odd");
        try {
            num = sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("please enter valid number");
        }
        num = sc2.nextInt();

        if (num % 2 ==0)
            System.out.println(num + " is a Even Number");
        else
            System.out.println(num + " is a Odd Number");

    }
}
