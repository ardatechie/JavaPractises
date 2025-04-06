package src;

public class Main {
    public static void main(String[] args) {
        //Creating Strings
        String s1 = "Hello";
        String s2 = "World";

        //Concatenation
        String result = s1 + " " + s2;
        System.out.println(result);

        //Length of a String
        int length = s1.length();

        //Character at Index
        char ch = s1.charAt(1);
        System.out.println(ch);

        //Substring
        String part = s1.substring(1, 4);

        //Index of Character
        int idx = s1.indexOf("l");  // First 'l'
        int lastIdx = s1.lastIndexOf("l");
        System.out.println(idx);
        System.out.println(lastIdx);

        //Contains
        if (s1.contains("lo")) {
            System.out.println("'lo' kelimesi mevcut.");
        } else System.out.println("'lo' kelimesi mevcut değil.");
    }
}