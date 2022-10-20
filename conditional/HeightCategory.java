package task2;

import java.util.Scanner;

public class HeightCategory {
    public static void main(String[] args) {
        int m;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("pls Enter ur Height");
            m =sc.nextInt();
            if ( m > 170) {
            System.out.println("The person is tall");
            } else if (m > 150 && m <= 170){
                System.out.println("The person has Averge height");
            }  else {
                System.out.println("The person is dwraf");
            }
        }catch (Exception e ) {
            System.out.println("pls enter Valid Number");
        }
    }
}
