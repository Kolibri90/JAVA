package Lecture2;

public class LogicalOperators {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 5;
        int numberX = 2;
        int numberY = 1;

        boolean equalNumberOneNumberX = numberX == numberOne; //false
        boolean equalNumberTwoNumberX = numberX == numberTwo; //false

        boolean greaterNumberOneNumberY = numberOne > numberY; //true
        boolean greaterNumberTwoNumberY = numberTwo > numberY; //true

        System.out.println("A && B true: " + (greaterNumberOneNumberY && greaterNumberTwoNumberY)); //both are ture, returns true
        System.out.println("A && B false: " + (equalNumberOneNumberX && equalNumberTwoNumberX)); // both are false, returns false
        System.out.println("A || B true: " + (equalNumberOneNumberX || greaterNumberTwoNumberY)); // false and true, returns true
        System.out.println("A || B false: " + (equalNumberOneNumberX || equalNumberTwoNumberX)); // false and false, return false

// && logical AND - returns true if both statements are true
// || logical OR - returns true if ONE of the statements is true
// ! logical NOT - Reverse the result, returns false if the result is true
    }
}