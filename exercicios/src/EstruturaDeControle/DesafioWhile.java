package EstruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Informe a nota: ");
            nota = sc.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNotas++;
            }
        }

        double media = nota / quantidadeDeNotas;
        System.out.println("Media = " + media);

        System.out.println(total);

        sc.close();

    }

}
