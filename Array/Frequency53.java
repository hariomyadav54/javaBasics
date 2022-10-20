package p1;

import java.util.Scanner;

public class Frequency53 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr1 = new int[101], fr1 = new int[101];
            int n, ctr;
            System.out.println("\n\nCount frequency of each element of an array:");
            System.out.println("------------------------------------------------");
            System.out.print("Input the number of elements to be stored in the array :");
            n = sc.nextInt();
            System.out.println("Input " + n + " elements in the array :");
            for(int i = 0; i < n; i++) {
                System.out.print("element - " + i + " : ");
                arr1[i] = sc.nextInt();
                fr1[i] = -1;
            }
            for(int i = 0; i < n; i++) {
                ctr = 1;
                for(int j = i + 1; j < n; j++) {
                    if(arr1[i] == arr1[j]) {
                        ctr++;
                        fr1[j] = 0;
                    }
                }
                if(fr1[i] != 0) {
                    fr1[i] = ctr;
                }
            }
            System.out.println("\nThe frequency of all elements of array : ");
            for(int i = 0; i < n; i++) {
                if(fr1[i] != 0) {
                    System.out.println(arr1[i] + " occurs " + fr1[i] + " times");
                }
            }
        }
    }

