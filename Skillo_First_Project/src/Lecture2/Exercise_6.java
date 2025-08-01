package Lecture2;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter year: ");
        int year = scanner.nextInt();

        boolean isLeap = ( year %4 == 0 && year % 100 !=0 || (year % 400 == 0));

        if (isLeap) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
