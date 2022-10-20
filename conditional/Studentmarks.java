package package1;

import java.util.Scanner;

public class Studentmarks {
    public static void main(String[] args) {
        Studentmarks data = new Studentmarks();
        data.addMarks();
    }

    public void addMarks() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Pls enter the roll number");
            int rollnumber = sc.nextInt();
            System.out.println("Pls enter the name");
            String name = sc.next();
            System.out.println("pls enter the marks");
            int phy = sc.nextInt();
            int chem = sc.nextInt();
            int computer = sc.nextInt();
            int totalmarks = (phy + chem + computer);
            System.out.println("total marks :-" +totalmarks);
            int percentage =((totalmarks / 300)*100);
            System.out.println("percentage :-" +percentage);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("invalid input");
        }
    }
}
