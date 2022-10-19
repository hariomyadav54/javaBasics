package package1;

import java.util.Scanner;

public class StringInRevers {
    static void main(String[] args) {
        {
            System.out.println("Enter string to reverse:");
            try {
                Scanner read = new Scanner(System.in);
                String str = read.nextLine();
                String reverse = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    rev = reverse + str.charAt(i);
                }
                System.out.println("Reversed string is:");
                System.out.println(reverse);

            } catch (Exception e) {
                System.out.println("invalid input");
            }
        }
    }
}
