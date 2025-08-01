package Lecture2;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 25;

        System.out.println("Test" + "Name");
        System.out.println("Addition: " + (numberOne + numberTwo));
        System.out.println("Substraction: " + (numberOne - numberTwo));
        System.out.println("Multiplication: " + (numberOne * numberTwo));
        System.out.println("Division: " + (numberTwo / numberOne));
        System.out.println("Modulus: " + (numberTwo % numberOne));
        System.out.println("Increment: " + ++numberOne); //pre-incrementation
        System.out.println("Decrement: " + --numberTwo); //pre-incrementation

        System.out.println("Test Increment and sum: " + (++numberOne + numberTwo));
    }
}
