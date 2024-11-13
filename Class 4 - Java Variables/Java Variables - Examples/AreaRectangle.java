import java.util.Scanner; // Import the Scanner class

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Digite uma base para seu retângulo: ");
        int base = scanner.nextInt();

        System.out.print("Digite uma altura para seu retângulo: ");
        int altura = scanner.nextInt();

        int areaRectangle = base*altura;

        System.out.println("A área do seu retângulo é: " + areaRectangle + "m²");
        
        scanner.close();  // Close the scanner
    }
  }