package p1;

import java.util.Scanner;

public class AccountUsingConstructer {
    public static void main(String[] args) {
        int count,counter=0;
        int accountNo, accountBalance;
        String accountType;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you are details below:- ");
        System.out.println("Enter Account Number:");
        accountNo = sc.nextInt();
        System.out.println("Enter Account Type:");
        accountType=sc.next();
        System.out.println("Enter Account balance:");
        accountBalance = sc.nextInt();

        Accountnew1 a = new Accountnew1(accountNo,accountBalance,accountType);

        while (counter==0) {
            System.out.println("\nPlease select the services You Want");
            System.out.println("Enter-1 for Deposit");
            System.out.println("Enter-2 for WithDraw");
            System.out.println("Enter-3 for Display Account Details");
            System.out.println("Enter-4 for Display Your Balance");
            System.out.println("Enter-5 for exits");
            count = sc.nextInt();
            switch (count) {
                case 1:
                    System.out.println("Enter amount to be deposit");
                    a.deposit(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter amount to be withdraw");
                    a.withdraw(sc.nextInt());
                    break;
                case 3:
                    System.out.println(a.displayAccountDetails());
                    break;
                case 4:
                    System.out.println("Your Balance is :"+a.getAccountBalance());
                    break;
                case 5:
                    counter++;
                    break;

                default:
                    System.out.println("please press valid input");
                    break;
            }
        }
    }
    }

