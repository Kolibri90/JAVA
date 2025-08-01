package Lecture2;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Where do you want go for vacation, Beach or Mountain?");
        String vacationType = scanner.next();

        switch (vacationType) {
            case "Beach":
                System.out.println("What is your budget?");
                double vacationBudget = scanner.nextDouble();
                if (vacationBudget < 50) {
                    System.out.println("We advice you Bulgaria as destination for vacation");
                } else {
                    System.out.println("We advice you to go outside bulgaria in vacation");
                }
                break;
            case "Mountain":
                System.out.println("What is your budget?");
                double vacationBudget2 = scanner.nextDouble();
                if (vacationBudget2 < 30) {
                    System.out.println("We advice you Bulgaria as destination for vacation");
                } else {
                    System.out.println("We advice you to go outside bulgaria in vacation");
                }
                break;
            default:
                System.out.println("Not such a destination");
        }
    }
}
