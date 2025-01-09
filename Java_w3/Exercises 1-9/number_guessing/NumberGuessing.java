import java.util.Scanner;

public class NumberGuessing {
    static void Number_Guessing() {
        Scanner myScanner = new Scanner(System.in);

        int randomNum = (int)(Math.random() * 101); // Número aleatório entre 0 e 100

        System.out.println("Digite o número de vezes que você deseja tentar adivinhar o número: ");
        int qntTentativas = myScanner.nextInt();

        while (qntTentativas > 0) {
            System.out.println("Faça um chute para tentar adivinhar o número: ");
            int chute = myScanner.nextInt();

            int diferenca = Math.abs(randomNum - chute); // Calcula a diferença absoluta

            if (diferenca == 0) {
                System.out.println("Parabéns! Você acertou o número!");
                break; // Sai do loop caso o chute esteja correto
            } else if (diferenca <= 5) {
                System.out.println("Você está pegando fogo!");
            } else if (diferenca <= 10) {
                System.out.println("Você está muito quente!");
            } else if (diferenca <= 20) {
                System.out.println("Você está quente!");
            } else {
                System.out.println("Você está frio!");
            }

            qntTentativas--; // Decrementa a quantidade de tentativas restantes
            System.out.printf("Tentativas restantes: %d\n", qntTentativas);
        }

        if (qntTentativas == 0) {
            System.out.println("Você perdeu! O número era: " + randomNum);
        }

        myScanner.close();
    }

    public static void main(String[] args) {
        Number_Guessing();
    }
}
