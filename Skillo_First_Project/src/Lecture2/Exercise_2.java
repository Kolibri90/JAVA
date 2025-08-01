package Lecture2;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day of the week from 1 to 7");
        int days = scanner.nextInt();

        switch (days){
            case 1:
                System.out.println("The first day of the week is Monday");
                break;
            case 2:
                System.out.println("The second day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The third day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The forth day of the week is Thursday");
                break;
            case 5:
                System.out.println("The fifth day of the week is Friday");
                break;
            case 6:
                System.out.println("The sixth day of the week is Saturday");
                break;
            case 7:
                System.out.println("The seventh day of the week is Sunday");
                break;
            default:
                System.out.println("Not supported day");
        }

    }
}
