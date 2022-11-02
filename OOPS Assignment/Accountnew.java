package p1;

import java.util.Scanner;

public class Accountnew {
    private int Accontnumber;
    private  String AccountType;
    private  int AccountBalance;

    void Diposit(float a) {
        AccountBalance += a;
        System.out.println("diposit amount " + a);
    }
    void withdarw(float a) {
        if (AccountBalance < a) {
            System.out.println("you are balance is low");
        } else {
            AccountBalance -= a;
            System.out.println("withdarw amount " + a);
        }
    }
    void checkBalance() {
        System.out.println("Balance is "+ AccountBalance);
    }
    void setAccountDetails() {
        System.out.println("you are Accontno:-"+Accontnumber+ " +/n "+  " " +"you are Account type;-"+ AccountType + " " +"you are Account Balance:-"+ AccountBalance);
    }
}
class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you are Accontno");
        Account b =new Account(134,"saving",5);
        b.setAccountDetails();
        b.Diposit(4);
        b.withdarw(3);
        b.checkBalance();
    }
}
