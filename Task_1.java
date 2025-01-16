import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a first number: ");
        int personA = scanner.nextInt();

        System.out.print("Write a second number: ");
        int personB = scanner.nextInt();

        System.out.println("You wrote a " + personA + " and " + personB);

    }
}