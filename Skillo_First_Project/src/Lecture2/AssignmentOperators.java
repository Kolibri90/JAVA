package Lecture2;

public class AssignmentOperators {
    public static void main(String[] args) {
        int numberOne = 10;

        System.out.println("=: " + numberOne); //most used one (x = 10)
        System.out.println("+=: " + (numberOne+=5)); // +5 = 15 (x = x+5)
        System.out.println("-=: " + (numberOne-=6)); // -6 = 9 (x = x-6)
        System.out.println("*=: " + (numberOne*=2)); // *2 = 18 (x = x*2)
        System.out.println("/=: " + (numberOne/=3)); // /3 =  6 (x = x/5)
        System.out.println("%=: " + (numberOne%=2)); // % = 0 (x = x%2)
    }
}
