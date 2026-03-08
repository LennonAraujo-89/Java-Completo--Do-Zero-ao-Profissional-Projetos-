package arraysECollections;

import java.util.Scanner;

public class Foreach01 {
    public static void main(String[] args) {
        
        /*
        double[] notas = {9, 8.4, 7, 6.4};

        double total = 0;
        for (double d : notas) {
            total += d;
        }

        System.out.printf("Media: %.1f", total / notas.length);
        */

        //Desafio

        Scanner sc = new Scanner(System.in);

        int x;
        double media = 0;
        System.out.println("Quantas notas serão somadas?:");
        x = sc.nextInt();

        double[] notas = new double[x];

        for(int i = 0; i < notas.length; i++){
            System.out.printf("\nDigite a nota %d: \n", i + 1);
            notas[i] = sc.nextDouble();
        }

        for (double d : notas) {
            media += d;
        }

        System.out.printf("\nA media do aluno: %.1f\n", media / notas.length);

        sc.close();

    }

}
