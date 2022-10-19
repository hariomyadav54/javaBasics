package package1;
import java.util.Scanner;
public class TwoPrimeNumber {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print(" pls Enter a you are number : ");
            int number = sc.nextInt();
            int x = 0;
            for (int i = 2; i <= number / 2; i++) {
                if (primeornot(i) == 1) {
                    if (primeornot(number - i) == 1) {
                        System.out.println(number + " = " + i + " + " + (number - i));
                        x = 1;
                    }
                }
            }
            if (x == 0)
                System.out.println(+number + " cannot be expressed as a sum of two prime numbers");
        } catch (Exception e){
            System.out.println("invalid input");
        }
         }
        public static int primeornot ( int n){
            int c = 1;
            for (int i = 2; i < n; i++){
                if (n % i == 0){
                    c = 0;
                    break;
                }
               }
            return c;
             }
           }

