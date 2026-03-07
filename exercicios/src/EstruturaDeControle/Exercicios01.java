package estruturaDeControle;

import java.util.Scanner;

public class Exercicios01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero entre 0 e 10: ");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.printf("Numero: %d e par.\n", x);
        }else{
            System.out.printf("Numero: %d e impar.\n", x);
        }

        sc.close();
    }

}
