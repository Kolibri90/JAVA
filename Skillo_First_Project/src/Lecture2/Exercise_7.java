package Lecture2;

import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter 1 for Fahrenheit to Celsius, or 2 for Celsius to Fahrenheit conversion:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter temperature in Fahrenheit: ");
            float fahrenheit = scanner.nextFloat();
            float celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("The temperature is Celsius is: " + celsius );
        }
        else if (choice == 2) {
            System.out.println("Enter temperature in Celsius: ");
            float celsius = scanner.nextFloat();
            float fahrenheit = celsius * 9 / 5 + 32;
            System.out.println("The temperature is Fahrenheit is: " + fahrenheit);
        }
        else {
            System.out.println("Invalid choice — please enter 1 or 2.");
        }

    }
    }

