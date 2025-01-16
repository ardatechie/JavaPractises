import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String isim = scanner.nextLine();

        System.out.println("Merhaba, " + isim + "!");
    }
}
