package package2;

import java.util.Scanner;

public class AlphabetVowel {
    public static void main(String[] args) {
        char my_input;
        System.out.println("Required packages have been imported");
        try {
            Scanner my_scanner = new Scanner(System.in);
            System.out.println("A reader object has been defined ");
            System.out.print("Enter the character : ");
            my_input = my_scanner.next().charAt(0);
            if (my_input == 'a' || my_input == 'e' || my_input == 'i' || my_input == 'o' || my_input == 'u')
                System.out.println("The character : " + my_input + " is a vowel");
            else
                System.out.println("The character : " + my_input + " is a consonant");
    } catch(Exception e){
        System.out.println(e);
        System.out.println("Invalid Input");
    }
}
}
