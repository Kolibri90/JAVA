package Lecture2;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age");

        int age = scanner.nextInt();

        if (age >= 16) {
            System.out.println("You are eligible to work.");
        }
        else {
            System.out.println("You are NOT eligible to work.");
        }
    }

}
