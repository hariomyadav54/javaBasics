package task5;

import java.util.Scanner;

public class IntegertoString {
    static  String[]  s = new String[] { "jan", "feb","march", "april","may","june","july","aug","sep","oct","nov","dec","invalidNumber"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 12");
         int n = sc.nextInt();
         String str = monthName1(n);
        System.out.println(" Month name: " + str); }
    static String monthName1 (int n){
        if (n >=1 && n <=12)
            return IntegertoString.s[n-1];
        else
            return IntegertoString.s[12];
    }
}
