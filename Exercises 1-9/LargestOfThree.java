import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] var0) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = myScanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = myScanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = myScanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro número (" + num1 + ") é o maior!");
        } 
        else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo número (" + num2 + ") é o maior!");
        } 
        else if (num3 > num1 && num3 > num2) {
            System.out.println("O terceiro número (" + num3 + ") é o maior!");
        } 
        else {
            System.out.println("Dois ou mais números são iguais e são os maiores.");
        }

        myScanner.close();
    }
}

