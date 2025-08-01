package Lecture2;

public class ComparisonOperators {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 5;

        boolean equalTo = numberTwo == numberOne; // =
        boolean notEqualTo = numberTwo!=numberOne; // not =
        boolean greaterThan = numberOne > numberTwo; // greater
        boolean lessThan = numberOne < numberTwo; // less
        boolean greaterOrEqual = numberOne >= numberTwo; // greater or =
        boolean lessOrEqual = numberOne <= numberTwo; //lesser or =

        System.out.println("equalTo: " + equalTo); //false
        System.out.println("notEqualTo: " + notEqualTo); //true
        System.out.println("greaterThan: " + greaterThan); //true
        System.out.println("lessThan: " + lessThan); //false
        System.out.println("greaterOrEqual: " + greaterOrEqual); //true
        System.out.println("lessOrEqual: " + lessOrEqual); //false
    }
}
