package MyFirstPackage;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minutes that will be converted into years and days");

        int minutes = scanner.nextInt();

        double years = minutes / 525600.00;
        double days = minutes / 1440.0;

        System.out.println("Entered minutes are: " + years + " years and " + days + " days ");
    }
}