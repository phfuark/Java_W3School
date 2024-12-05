import java.util.Scanner;  // Import the Scanner class

class main{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.printf("Digite o nome do aluno %d: ", i);
            String nome = myScanner.nextLine();

            System.out.printf("Digite a qunatidade de notas do aluno %s", nome);
            int qnt_notas = myScanner.nextInt(); 

            int totalNotas = 0;

            for (int j = 0; j < qnt_notas; j++){
                System.out.printf("Digite a nota %d do aluno %s: ", j+1, nome);
                int nota = myScanner.nextInt();
                totalNotas =+ nota;
            }

            double media = totalNotas/qnt_notas;
            System.out.printf("O aluno %s teve a média %.2f", nome, media);
        }
        myScanner.close();
    }
}