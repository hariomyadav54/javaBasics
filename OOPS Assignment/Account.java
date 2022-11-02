package p1;

public class Account {
   int Accontnumber;
     String AccountType;
     int AccountBalance;
    Account(){

    }
    Account(int Acno, String Actype, int Acbalance) {
        Accontnumber = Acno;
        AccountType = Actype;
        AccountBalance = Acbalance;
    }
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
class  Test{
    public static void main(String[] args) {
        Account b =new Account(134,"saving",5);
        b.setAccountDetails();
        b.Diposit(4);
        b.withdarw(3);
        b.checkBalance();
    }
}