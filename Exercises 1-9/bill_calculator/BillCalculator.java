import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BillCalculator {
    static void Bill_Calculator(){

        Scanner myScanner = new Scanner(System.in);


        String[] produtos = {"Arroz", "Feijão", "Macarrão", "Óleo", "Sal", "Açúcar", "Café", "Leite", "Pão", "Manteiga"};
        double[] precos = {5.99, 7.49, 3.89, 8.99, 1.49, 4.59, 12.99, 4.19, 6.39, 9.89};
        int[] estoque = new int[produtos.length];
        for (int i = 0; i < estoque.length; i++) {
            estoque[i] = 10; // inicializa o estoque com 10 unidades para cada produto
        }

        ArrayList<String> produtoEscolhido = new ArrayList<>();
        ArrayList<Integer> quantidadeEscolhida = new ArrayList<>();
        ArrayList<Double> contaProduto = new ArrayList<>();


        double totalCompra = 0.0;

        System.out.println("Produtos disponíveis:");
        for (int i = 1; i < produtos.length; i++) {
            System.out.printf("%d: %s - R$%.2f\n", i, produtos[i], precos[i]);
        }

        while (true) {
            System.out.printf("Digite o número correspondente ao produto que você deseja, ou digite '0' para finalizar o processo.");
            int escolha = myScanner.nextInt();

            if (escolha==0){
                System.out.println("Obrigado por Frequentar nosso mercadinho!");
                break;
            }
            else if (escolha < 0){
                System.out.println("Opção inválida, digite um número novamente.");
            }
            else{
                String produto = produtos[escolha];
                double preco = precos[escolha];
                int estoque_produto = estoque[escolha];
                
                System.out.printf("Quantos do produto %s você deseja? ", produto);
                int quantidade = myScanner.nextInt();
            }
        }
    }

   
    public static void main(String[] args){
        Bill_Calculator();
    }
}
