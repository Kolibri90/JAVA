package Lecture2;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter quantity");
        int quantity  = scanner.nextInt();
        System.out.println("Please enter price");
        double price  = scanner.nextDouble();

        if (quantity >=100 && quantity <=120) {
            System.out.println("The discount rate is 15%");
        double discount = (quantity*price)*0.15;
            System.out.println("The discount is: " + discount);
        double revenue = ((quantity*price)-discount);
            System.out.println("The revenue is: " + revenue);
        }
        else if (quantity >120) {
            System.out.println("The discount rate is 20%");
            double discount = (quantity*price)*0.20;
            System.out.println("The discount is: " + discount);
            double revenue = ((quantity*price)-discount);
            System.out.println("The revenue is: " + revenue);
        }
        else  {
            double discount = (quantity*price)*0.00;
            System.out.println("The discount rate is 0%");
            System.out.println("The discount is: " + discount);
            double revenue = ((quantity*price)-discount);
            System.out.println("The revenue is: " + revenue);
        }
    }
}
