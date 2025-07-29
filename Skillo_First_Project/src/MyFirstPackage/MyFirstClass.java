package MyFirstPackage;


public class MyFirstClass {

    public static void main(String[] args) {
        // (String[] args) - приемане на аргументи, без него методът няма да работи !
        System.out.println("Start");
        int wholeNumber = 100;
        double fractionalNumber = 123.564;
        String name = "Mirko loves Tsvetomira !";

        System.out.println(wholeNumber);
        System.out.println(fractionalNumber);
        System.out.println(name);
        System.out.println("------------------");
        byte firstByte = 45;
        short firstShort;
        long firstLong = 1234L;
        float firstFloat = 1234.45434F;
        boolean firstBoolean = true;
        boolean secondBoolean = false;

        firstShort = 22;
        System.out.println(firstByte);
        System.out.println(firstLong);
        System.out.println(firstShort);
        System.out.println(firstFloat);
        System.out.println(firstBoolean);
        System.out.println(secondBoolean);


    }
}
