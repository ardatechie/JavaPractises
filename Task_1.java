import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input from the user with better prompts
        int firstNumber = getInput("Write the first number: ", scanner);
        int secondNumber = getInput("Write the second number: ", scanner);

        // Outputting the result
        System.out.println("You wrote the numbers: " + firstNumber + " and " + secondNumber);
    }

    private static int getInput(String prompt, Scanner scanner) {
        int number = 0;
        boolean validInput = false;

        // Repeatedly ask for input until valid number is entered
        while (!validInput) {
            try {
                System.out.print(prompt);
                number = scanner.nextInt();
                validInput = true; // Input is valid, exit loop
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
        return number;
    }
}