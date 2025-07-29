package MyFirstPackage;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a, b and c of the triangle");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("The perimeter of the triangle is: " + (a + b + c) );

        System.out.println("----------------------------");

        System.out.println("Enter side and height of the triangle");

        int side = scanner.nextInt();
        int height = scanner.nextInt();

        System.out.println("The aria of the triangle is: " + (0.5 * side * height) );
    }
}
