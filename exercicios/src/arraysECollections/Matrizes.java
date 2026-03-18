package arraysECollections;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdeAlunos = sc.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int qtdeNotass = sc.nextInt();

        double[][] notasTurma = new double[qtdeAlunos][qtdeNotass];


        double total = 0;
        // a percorre cada aluno e n percorre cada nota
        for(int a = 0; a < notasTurma.length; a++){
            for(int n = 0; n < notasTurma[a].length; n++){
                System.out.printf("Informe a nota %d do aluno %d: ", a + 1, n + 1);
                notasTurma[a][n] = sc.nextDouble();
                total += notasTurma[a][n];
            }
        }

        System.out.println(total);
        sc.close();
    }

}
