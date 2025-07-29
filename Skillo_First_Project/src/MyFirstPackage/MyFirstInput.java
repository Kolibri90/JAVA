package MyFirstPackage;

import java.util.Scanner; // External library

public class MyFirstInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine(); // nextLine is the method that scanner calls.
        System.out.println("The entered  name is:" + name);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your height:");
        float height = scanner.nextFloat();


        System.out.println("The age of " + name + " is: " + age + "height is:" + height);

        System.out.println("Enter two numbers.");
        int NumberOne = scanner.nextInt();
        int NumberTwo = scanner.nextInt();
        System.out.println("The entered numbers are: " + NumberOne + " and " + NumberTwo);
        System.out.println("The sum of the numbers is:" + (NumberOne+NumberTwo) ); //Prints the sum of the numbers
    }
}
