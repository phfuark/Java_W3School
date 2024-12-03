import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] var0) {
      Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
      
      System.out.println("Digite seu número a ser verificado: ");
      int num = myScanner.nextInt();

      if (num%2 == 0){
         System.out.println("Seu número é par!");
      }
      else{
         System.out.println("Seu número é ímpar!");
      }
      myScanner.close();
    }
 }
 