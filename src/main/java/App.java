import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Choose either? 1 to Encode or 2 to Decode");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if(choice == 1)
        {
            System.out.println("Enter a text");
            String inputText = scanner.nextLine().toUpperCase();
            System.out.println("Enter a key ");
            int key = scanner.nextInt();
            Encrypt testEncrypting = new Encrypt(inputText,key);
            System.out.println(testEncrypting.encrypt());

        }
        else if(choice == 2)
        {
            System.out.println("Enter encrypted text");
            String inputText = scanner.nextLine().toUpperCase();
            System.out.println("Enter a key ");
            int key = scanner.nextInt();
            Decrypt testEncrypting = new Decrypt(inputText, key);
            System.out.println(testEncrypting.getDescription());
        }

        else
        {
            System.out.println("Input cannot be identified. Try again");
        }
    }
}

