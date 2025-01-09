import java.util.Scanner;

class Main {
    static void Grading_System() {
        Scanner myScanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Digite o nome do aluno %d: ", i);
            String nome = myScanner.nextLine();

            System.out.printf("Digite a quantidade de notas do aluno %s: ", nome);
            int qnt_notas = myScanner.nextInt();

            myScanner.nextLine();

            int totalNotas = 0;

            for (int j = 1; j <= qnt_notas; j++) {
                System.out.printf("Digite a nota %d do aluno %s: ", j, nome);
                int nota = myScanner.nextInt();
                totalNotas += nota;
            }

            double media = (double) totalNotas / qnt_notas;
            System.out.printf("O aluno %s teve a média %.2f\n", nome, media);
        }

        myScanner.close();
    }

    public static void main(String[] args) {
        Grading_System();
    }
}
