package src;

public class Main {
    public static void main(String[] args) {
        stringInformation("Hello World");
    }

    public static void stringInformation(String string) {
        int length = string.length();
        System.out.printf("The length of the string is: %d%n", length);
        System.out.printf("The string's first character is: %c%n", string.charAt(0));
    }


}