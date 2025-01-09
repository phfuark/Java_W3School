import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();

        // Comparing x and y
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is equal to y");
        }

        scanner.close();  // Close the scanner
    }
}
