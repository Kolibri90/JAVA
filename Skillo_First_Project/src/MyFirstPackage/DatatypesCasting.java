package MyFirstPackage;

public class DatatypesCasting {
    public static void main(String[] args) {

        byte firstByte = 10;
        // redundant - used only in one place
        short firstShort = firstByte;
        int firstInt = firstByte;
        int secondInt = firstShort;

        char firstChar = (char)firstShort;
        // This is Manual Casting

        System.out.println("Byte:" + firstByte);
        System.out.println("Short:" + firstShort);
        System.out.println("First Int:" + firstInt);
        System.out.println("Second Int" + secondInt);
        System.out.println("First Char:" + firstChar);
        // Char is not printed, because can be only one character
        // In this example, we don't lose information
        System.out.println("-----------------------");

        double firstDouble = 123456.789;
        float firstFloat = (float) firstDouble;
        long firstLong = (long) firstFloat;
        int firstIntNumber = (int) firstLong;
        byte firstByteNumber = (byte) firstIntNumber;

        System.out.println("First Double:" + firstDouble);
        System.out.println("First Float:" + firstFloat);
        System.out.println("First Long: " + firstLong);
        System.out.println("First Int Number: " + firstIntNumber);
        System.out.println("Byte: " + firstByteNumber);
        //MAX equivalent in bytes = 64

// Ctrl + Shift and arrows we move the line of the code;
    }
}
