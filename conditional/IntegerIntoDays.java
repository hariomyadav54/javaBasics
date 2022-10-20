package package4;

import java.util.Scanner;

public class IntegerIntoDays {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Input number: ");
            int day = in.nextInt();

            System.out.println(getDayName(day));
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("invalid ");
        }
    }

    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day range";
        }

        return dayName;
    }
}



