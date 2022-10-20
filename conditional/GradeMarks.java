package package5;

import java.util.Scanner;

public class GradeMarks {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Enter Number of Subject");
        count = sc.nextInt();

        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += sc.nextInt();
        }
        System.out.println("Total MArks : " + totalMarks);
        percentage = (totalMarks / (count * 100)) * 100;
        switch ((int) percentage / 10) {
            case 9:
                System.out.println("Grade : A+");
                break;
            case 8:
            case 7:
                System.out.println("Grade : A");
                break;
            case 6:
                System.out.println("Grade : B");
                break;
            case 5:
                System.out.println("Grade : C");
                break;
            default:
                System.out.println("Grade : D");
                break;
        }
    }
}
