package task7;

import java.util.Scanner;

public class Eligibleforadmission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter marks in maths");
        int maths = sc.nextInt();
        System.out.println("enter marks in phy");
        int phy = sc.nextInt();
        System.out.println("enter marks in cham");
        int cham = sc.nextInt();
        if (maths>=65){
            if (phy >=55){
                if (cham >=50){
                    if (((maths + phy +cham)>= 190) || ((maths + phy)>=140)){
                        System.out.println("Candidate is eligible");
                    }
                }
            }
        }
        else {
            System.out.println("Candidate is not eligible");
        }
    }
}
