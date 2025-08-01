package Lecture2;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the first angel of the triangle:");
        float firstAngle = scanner.nextFloat();

        System.out.println("Please Enter the second angel of the triangle:");
        float secondAngle = scanner.nextFloat();

        System.out.println("Please Enter the second angel of the triangle:");
        float thirdAngle = scanner.nextFloat();
        float sumAngles = firstAngle + secondAngle + thirdAngle;

        System.out.println("The sum of all trangle angles is :" + sumAngles);

        if (sumAngles <180.00001) {

            if (firstAngle == 90 || secondAngle == 90 || thirdAngle == 90) {
                System.out.println("The triangle is right-angled. ");
            } else if (firstAngle == 60 && secondAngle == 60 && thirdAngle == 60) {
                System.out.println("The triangle is equilateral. ");
            } else if (firstAngle > 90 || secondAngle > 90 || thirdAngle > 90) {
                System.out.println("The triangle is obtuse. ");
            } else if (firstAngle == secondAngle || secondAngle == thirdAngle || firstAngle == thirdAngle) {
                System.out.println("The triangle is isosceles. ");
            } else if (firstAngle != secondAngle && secondAngle != thirdAngle && firstAngle != thirdAngle) {
                System.out.println("The triangle is multifaceted. ");
            } else if (firstAngle < 90 && secondAngle < 90 && thirdAngle < 90) {
                System.out.println("The triangle is acute. ");
            }
        }
        else {
            System.out.println("Based on given angeles the triangle can not be build!");
        }
        }
    }



